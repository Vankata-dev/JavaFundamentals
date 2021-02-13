import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        if (multiplier > 10 ){
            sum = digit * multiplier;
            System.out.printf("%d X %d = %d",digit, multiplier, sum);
        }
        for (int i = multiplier; multiplier <= 10 ; multiplier++) {
            sum = digit * multiplier;

            System.out.printf("%d X %d = %d%n", digit, multiplier, sum);

        }
    }
}
