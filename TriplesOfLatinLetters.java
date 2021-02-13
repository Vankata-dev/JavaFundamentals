import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        int timesPrinted = Integer.parseInt(scanner.nextLine());
        char firstChar = 97;
        char lastChar = 122;
        for (int i = 1;i<=timesPrinted; i++)

            System.out.println(firstChar);
    }
}
