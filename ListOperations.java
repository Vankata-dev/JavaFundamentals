import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();


        while (!input.equals("End")){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command){
                case "Add":
                    numbers.add(Integer.parseInt(tokens[1]));
                    break;
                case "Insert":
                    int number = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    if (index > numbers.size()) {
                        System.out.println("Invalid index");
                        break;
                    }else {
                        if (numbers.size() == index){
                            numbers.add(numbers.size() - 1, number);
                            break;
                        }else {
                            numbers.add(index, number);
                            break;
                        }
                    }
                case "Remove":
                    if (Integer.parseInt(tokens[1]) > numbers.size()){
                        System.out.println("Invalid index");
                        break;
                    }else {
                        numbers.remove(Integer.parseInt(tokens[1]));
                    }
                    break;
                case "Shift":
                    if (tokens[1].equals("left")){
                        for (int i = 1; i <=Integer.parseInt(tokens[2]) ; i++) {
                            int shift = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(shift);
                        }
                    }else if (tokens[1].equals("right")){
                        for (int i = 1; i <= Integer.parseInt(tokens[2]) ; i++) {
                            int shift = numbers.get(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(0 , shift);
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
