import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int firstIndex = Integer.parseInt(scanner.nextLine());
        int secondIndex = Integer.parseInt(scanner.nextLine());


        while (firstIndex <= secondIndex) {
            char indexAsChar = ((char) firstIndex);
            System.out.print(indexAsChar + " ");
            firstIndex++;
        }
    }
}
