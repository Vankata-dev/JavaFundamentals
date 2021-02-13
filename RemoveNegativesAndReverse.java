import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] splitInput = input.split("\\s+");
        List<Integer> numbers = new ArrayList<>(input.length());

        for (int i = 0; i < splitInput.length; i++) {
            numbers.add(Integer.parseInt(splitInput[i]));
        }

        numbers.removeIf(n -> n < 0);
        if (numbers.isEmpty()){
            System.out.println("empty");
            return;
        }

        Collections.reverse(numbers);
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
