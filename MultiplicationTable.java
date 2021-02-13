import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        int i = 0;
        while (i < 10){
            i++;
            sum = digit * i;
            System.out.printf("%d X %d = %d%n", digit, i, sum);

        }
    }
}