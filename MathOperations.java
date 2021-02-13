import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(new DecimalFormat("0.##").format( calculate(Integer.parseInt(scanner.nextLine()),scanner.nextLine().charAt(0),Integer.parseInt(scanner.nextLine()))));
    }

    private static double calculate(int a, char operator, int b) {

        double result = 0;

        switch (operator) {
            case '/':
                result = a / b;
                break;
            case '*':
                result = a * b;
                break;
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
        }

        return result;
    }

}
