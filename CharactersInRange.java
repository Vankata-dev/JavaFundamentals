import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printChars(scanner.nextLine().charAt(0),scanner.nextLine().charAt(0));

    }

    public static void printChars (char firs,char last){

        if (firs > last){
            for (int i = last + 1; i < firs; i++) {
                System.out.print((char)i + " ");
            }
        }else for (int i = firs+ 1; i < last ; i++) {
//$ % & ' ( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ; < = > ? @ A B
            System.out.print((char) i + " ");
        }

    }

}
