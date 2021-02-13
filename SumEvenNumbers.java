import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arrayAsStrings = input.split(" ");

        int[] arr = new int[arrayAsStrings.length];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrayAsStrings[i]);
            if (arr[i] % 2 == 0){
                sum += arr[i];
        }
    }
        System.out.println(sum);
}
}
