import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = doubleParsLineOfNumbers(scanner.nextLine());
        DecimalFormat decimalFormat = new DecimalFormat("0.##");

        boolean search = true;

        while (search) {
            search = false;
            for (int i = 0; i < numbers.size() - 1; i++) {
                double current = numbers.get(i);
                double next = numbers.get(i + 1);

                if (current == next) {
                    numbers.remove(i);
                    numbers.set(i, current + next);
                    search = true;
                    break;
                }

            }
        }
        for (Double number : numbers) {
            System.out.print(decimalFormat.format(number)+ " ");
        }

    }



    public static List<Double> doubleParsLineOfNumbers(String input) {
        String[] inputAsString = input.split(" ");
        List<Double> numbers = new ArrayList<>(input.length());
        for (int i = 0; i < inputAsString.length; i++) {
            double number = Double.parseDouble(inputAsString[i]);
            numbers.add(number);
        }
        return numbers;
    }


}
