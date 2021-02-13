import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        List<String> guestList = new ArrayList<>(lines);

        for (int i = 1; i <= lines; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+");
            String names = tokens[0];

            String commandAdd = names + " is going!";
            String commandRemove = names + " is not going!";

            if (input.equals(commandAdd)) {
                if (guestList.contains(names)) {
                    System.out.println(names + " is already in the list!");
                } else {
                    guestList.add(names);

                }
            }else if (input.equals(commandRemove)) {
                if (guestList.contains(names)) {
                    guestList.remove(names);
                } else {
                    System.out.println(names + " is not in the list!");

                }
            }

        }
        for (String guests : guestList) {
            System.out.println(guests);
        }

    }
}
