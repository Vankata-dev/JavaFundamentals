import java.util.Scanner;

public class PrintAndSum04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.printf("Sum: %d\n", sum);
    }
}
