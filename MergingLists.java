
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = listOfInt(scanner.nextLine());
        List<Integer> secondList = listOfInt(scanner.nextLine());
        List<Integer> combined = new ArrayList<>();

        if (firstList.size() > secondList.size()) {
            for (int i = 0; i < firstList.size(); i++) {
                combined.add(firstList.get(i));
                while (i < secondList.size()) {
                    combined.add(secondList.get(i));
                    break;
                }
            }
        } else {
            for (int i = 0; i < secondList.size(); i++) {
                while (i < firstList.size()) {
                    combined.add(firstList.get(i));
                    break;
                }
                combined.add(secondList.get(i));
            }
        }

        for (Integer integer : combined) {
            System.out.print(integer + " ");
        }
    }


    public static List<Integer> listOfInt(String input) {
        String[] inputAsString = input.split(" ");
        List<Integer> numbers = new ArrayList<>(input.length());
        for (int i = 0; i < inputAsString.length; i++) {
            int number = Integer.parseInt(inputAsString[i]);
            numbers.add(number);
        }
        return numbers;
    }

}
