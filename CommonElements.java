import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String[] firstInputAsStrings = firstInput.split(" ");
        String[] firstArray = new String[firstInputAsStrings.length];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = firstInputAsStrings[i];
        }

        String secondInput = scanner.nextLine();
        String[] secondInputAsStrings = secondInput.split(" ");
        String[] secondArray = new String[secondInputAsStrings.length];
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = secondInputAsStrings[i];
        }

        for (int i = 0; i <secondArray.length ; i++) {
            for (int j = 0; j <firstArray.length; j++) {
                if (secondArray[i].equals(firstArray[j])){
                    System.out.print(secondArray[i]+" ");
                }
            }
        }

    }
}





