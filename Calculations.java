import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        switch (action) {
            case "add":
                addNumbers(firstNumber, secondNumber);
                break;
            case "multiply":
                multiplyNumbers(firstNumber, secondNumber);
                break;
            case "subtract":
                subtractNumbers(firstNumber, secondNumber);
                break;
            case "divide":
                divideNumbers(firstNumber, secondNumber);
                break;
        }

    }

    public static void addNumbers(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        System.out.println(sum);

    }

    public static void multiplyNumbers(int firstNumber, int secondNumber) {
        int sum = firstNumber * secondNumber;
        System.out.println(sum);
    }

    public static void subtractNumbers(int firstNumber, int secondNumber) {
        int sum = firstNumber - secondNumber;
        System.out.println(sum);
    }

    public static void divideNumbers(int firstNumber, int secondNumber) {
        int sum = firstNumber / secondNumber;
        System.out.println(sum);
    }
}
