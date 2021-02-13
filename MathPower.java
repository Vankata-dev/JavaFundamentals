import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        System.out.println(new DecimalFormat("0.####").format(powNumbers(firstNumber,secondNumber)));

    }

    public static double powNumbers (double firstNumber, double secondNumber){

        double sum = 0;
         return  sum = Math.pow(firstNumber, secondNumber);
    }
}
