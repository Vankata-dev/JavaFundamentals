import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = listOfNumbers(scanner.nextLine());

        if (numbers.size() % 2 == 0) {

            for (int i = 0; i < numbers.size(); i++) {
                int current = numbers.get(i);
                int last = numbers.get(numbers.size() - 1);
                numbers.remove(numbers.size() - 1);
                numbers.set(i, current + last);
            }
        }else {
            for (int i = 0; i < numbers.size() / 2 ; i++) {
                int current = numbers.get(i);
                int last = numbers.get(numbers.size() - 1);
                numbers.remove(numbers.size() - 1);
                numbers.set(i, current + last);
            }
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }

    public static List<Integer> listOfNumbers (String input){
        String[] inputAsString = input.split(" ");
        List<Integer> numbers = new ArrayList<>(input.length());
        for (int i = 0; i <inputAsString.length ; i++) {
            int number = Integer.parseInt(inputAsString[i]);
            numbers.add(number);
        }
        return numbers;
    }
}
