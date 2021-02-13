import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] splitInput = input.split("\\s+");
        List<Integer> wagons = new ArrayList<>(splitInput.length);
        for (int i = 0; i < splitInput.length; i++) {
            wagons.add(Integer.parseInt(splitInput[i]));
        }

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            if (command.equals("Add")) {
                wagons.add(Integer.parseInt(tokens[1]));
            }else {
                int passengers = Integer.parseInt(tokens[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if (wagons.get(i) + passengers <= maxCapacity) {
                        int newPassengers = wagons.get(i) + passengers;
                        wagons.set(i, newPassengers);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }


    }
}
