import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int timesRepeat = scanner.nextInt();
        repeatString(input, timesRepeat);

    }

    public static void repeatString (String input, int times){
        for (int i = 1; i <=times ; i++) {
            System.out.print(input);
        }

    }
}
