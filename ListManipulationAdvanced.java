import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] split = input.split(" ");
        List<Integer> numbers = new ArrayList<>(split.length);
        for (int i = 0; i < split.length; i++) {
            numbers.add(Integer.parseInt(split[i]));
        }


        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] tokens = command.split("\\s+");
            command = tokens[0];
            switch (command) {
                case "Contains":
                    if (numbers.contains(Integer.parseInt(tokens[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    switch (tokens[1]) {
                        case "even":
                            for (Integer number : numbers) {
                                if (number % 2 == 0) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "odd":
                            for (Integer number : numbers) {
                                if (number % 2 != 0) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;

                case "Get":
                    int sum = 0;
                    for (Integer number : numbers) {
                        sum += number;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = tokens[1];
                    switch (condition) {
                        case "<":
                            for (Integer number : numbers) {
                                if (number < Integer.parseInt(tokens[2])) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (Integer number : numbers) {
                                if (number > Integer.parseInt(tokens[2])) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (Integer number : numbers) {
                                if (number >= Integer.parseInt(tokens[2])) {
                                    System.out.print(number + " ");

                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (Integer number : numbers) {
                                if (number <= Integer.parseInt(tokens[2])) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }
            command = scanner.nextLine();
        }

    }

}
