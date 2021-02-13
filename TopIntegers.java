import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(element -> Integer.parseInt(element)).toArray();

        for (int i = 0; i <numbers.length ; i++) {
            boolean isTopIntiger = true;
            int currentNumber = numbers[i];

            for (int j = i+1; j <numbers.length ; j++) {
                if (currentNumber <= numbers[j]){

                }
                    isTopIntiger = false;
            }
            if (isTopIntiger){
                System.out.println(isTopIntiger + " ");
            }
        }
    }
}
