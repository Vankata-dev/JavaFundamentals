import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbr = Integer.parseInt(scanner.nextLine());
        int digit = 0;
        int sum= 0;

        while (0 < numbr) {
            digit = numbr % 10;
            numbr = numbr / 10;
            sum += digit;
        }
        System.out.println(sum);
    }
}


