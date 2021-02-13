import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] longestSequence = new int[numbers.length] ;
        //2 1 1 2 3 3 2 2 2 1
        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    for (int k = 0; k <longestSequence.length ; k++) {
                        longestSequence[k] = numbers[j];
                    }
                }
            }
        }
        System.out.println();
    }
}

