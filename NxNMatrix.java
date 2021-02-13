import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        printNxN(input);

    }

    public static void printNxN (int n){

        for (int i = 1; i <= n ; i++) {
            System.out.print(n + " ");
            for (int j = n; j <= n ; j++) {
                if (j == n){
                    System.out.println();
                }
                System.out.print(n + " ");

            }
        }

    }

}
