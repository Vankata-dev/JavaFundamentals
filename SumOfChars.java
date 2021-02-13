import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < lines; i++){
            String str  = scanner.nextLine();
            char ch = str.charAt(0);
            int ascciValue = ch;
            sum +=ch;
        }
        System.out.println("The sum equals: " + sum);
    }
}
