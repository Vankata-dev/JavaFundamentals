import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type){
            case "int":
                System.out.println(getMax(scanner.nextInt(),scanner.nextInt()));
                break;
            case "char":
                System.out.println(getMax(scanner.nextLine().charAt(0),scanner.nextLine().charAt(0)));
                break;
            case "string":
                System.out.println(getMax(scanner.nextLine(),scanner.nextLine()));
        }


    }

    public static int getMax (int firstNum, int secondNum){
        Scanner scanner = new Scanner(System.in);
        if (firstNum > secondNum){
            return firstNum;
        }else return secondNum;
    }

    public static char getMax (char first, char second){
        if (first > second){
            return first;
        }else return second;
    }

    public static String getMax (String first, String second){
        if (first.compareTo(second) >= 0){
            return first;
        }else return second;
    }

}
