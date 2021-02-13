import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String[] firstInputAsString = firstInput.split(" ");
        int[] arrayOne = new int[firstInput.length()];
        for (int i = 0; i < firstInputAsString.length; i++) {
            arrayOne[i] = Integer.parseInt(firstInputAsString[i]);
        }


        String secondInput = scanner.nextLine();
        String[] secondInputAsString = secondInput.split(" ");
        int[] arrayTwo = new int[secondInput.length()];
        for (int i = 0; i < secondInputAsString.length; i++) {
            arrayTwo[i] = Integer.parseInt(secondInputAsString[i]);
        }

        boolean areEqual = true;
        int notEqualIndex = 0;

        if (arrayOne.length == arrayTwo.length) {
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayOne[i] != arrayTwo[i]) {
                    areEqual = false;
                    notEqualIndex = i -1;

                }
            }
        } else {
            areEqual = false;
        }
        if (areEqual) {
            int sum = 0;
            for (int number : arrayOne) {
                sum += number;
            }

            System.out.println("Arrays are identical. Sum:" + " " + sum);
        } else {
            System.out.println("Arrays are not identical. Found difference at "+ notEqualIndex+ " index.");

        }
    }
}



