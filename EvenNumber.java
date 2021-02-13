import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit = Integer.parseInt(scanner.nextLine());

        while (digit % 2 == 0)
            System.out.printf("The number is: %d", Math.abs(digit));
            digit = scanner.nextInt();
            for (int i = digit; !(digit % 2 == 0); i++) {
                System.out.println("Please write an even number.");
                digit = scanner.nextInt();
            }
        }
    }


