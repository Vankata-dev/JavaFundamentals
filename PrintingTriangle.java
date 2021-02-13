import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {

        int input = new Scanner (System.in).nextInt();

        for (int i = 1; i <= input ; i++) {
            printIncreasingNumbers(i);
        }
        for (int i = input - 1; i >= 1 ; i--) {
            printIncreasingNumbers(i);
        }


    }

    public static void printIncreasingNumbers(int number){

        for (int i = 1; i <= number ; i++) {
            System.out.print(i);
            if ( i < number){
                System.out.print(" ");
            }
        }
        System.out.println();

    }

}
