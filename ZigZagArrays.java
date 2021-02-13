import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = scanner.nextInt();

        int[] firstArray = new int[lines];
        int[] secondArray = new int[lines];

        for (int i = 0; i <= lines-1 ; i++) {
            int firstInput = scanner.nextInt();
            int secondInput = scanner.nextInt();
            if (i % 2 == 0){
                firstArray[i] = firstInput;
                secondArray [i] = secondInput;
            }else {
                secondArray[i] = firstInput;
                firstArray[i] = secondInput;
            }
        }
        for (int i = 0; i <firstArray.length ; i++) {
            System.out.print(firstArray[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i <secondArray.length ; i++) {
            System.out.print(secondArray[i]+" ");
        }

        System.out.print(firstArray.length);
        System.out.print(secondArray);
    }
}
