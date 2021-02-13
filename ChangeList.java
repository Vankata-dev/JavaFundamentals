import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            if (command.equals("Delete")){
                for (int i = 0; i <numbers.size() ; i++) {
                    if (numbers.get(i) == Integer.parseInt(tokens[1])){
                        numbers.remove(numbers.get(i));
                        i -= 1;
                    }
                }
            }else if (command.equals("Insert")){
                int element = Integer.parseInt(tokens[1]);
                int position = Integer.parseInt(tokens[2]);

                numbers.add(position, element);
            }
            input = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }

}
