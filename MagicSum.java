import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayOfNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(element -> Integer.parseInt(element)).toArray();
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <arrayOfNumbers.length ; i++) {
            for (int j = i; j <arrayOfNumbers.length ; j++) {
                if (arrayOfNumbers[i] + arrayOfNumbers[j] == number){
                    System.out.print(arrayOfNumbers[i]+" "+arrayOfNumbers[j]);
                    System.out.println();
                }
            }
        }

    }
}
