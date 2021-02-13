import java.util.Scanner;

public class DeclaringAndInvokingMethods {
    public static void main(String[] args) {

        printInt();
    }

    public static void printInt (
    ) {
        Scanner scanner = new Scanner(System.in);
        String positiveOrNegative = "";

        int input = scanner.nextInt();

        if (input < 0){
            positiveOrNegative="negative";
        }else if (input > 0){
            positiveOrNegative = "positive";
        }else {
            positiveOrNegative = "zero";
        }

        System.out.println("The number "+input+" is "+positiveOrNegative+".");

    }
}
