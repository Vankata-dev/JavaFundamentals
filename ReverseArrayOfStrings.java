import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        char[] inpAsArr = input.toCharArray();

        for (int i = 0; i < inpAsArr.length /2; i++) {
            int swap = inpAsArr.length - 1 - i;
            char oldChar = (char) inpAsArr[i];
            inpAsArr[i] = inpAsArr[swap];
            inpAsArr[swap] = oldChar;
        }
        for (int i = 0; i < inpAsArr.length; i++) {
            System.out.print(inpAsArr[i] );
        }

    }
}



