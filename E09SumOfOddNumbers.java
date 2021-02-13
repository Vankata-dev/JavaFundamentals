import java.util.Scanner;

public class E09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = n;
        for (int i = 1; i<= counter; i+=2) {
            sum += i;
            System.out.println(i);
        }
        System.out.printf("Sum: %d", sum);
    }
}
