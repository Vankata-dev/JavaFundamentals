
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Add":
                    numbers.add(Integer.parseInt(tokens[1]));
                    break;
                case "Remove":
                    numbers.remove(Integer.parseInt(tokens[1]));
                    break;
                case "RemoveAt":
                    numbers.remove(Integer.parseInt(tokens[1]));
                    break;
                case "Insert":
                    numbers.add(Integer.parseInt(tokens[2]), Integer.parseInt(tokens[1]));
                    break;
            }
            input = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }


}



