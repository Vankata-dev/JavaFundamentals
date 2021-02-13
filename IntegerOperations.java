import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int intuger1 = scanner.nextInt();
         int intuger2 = scanner.nextInt();
         int intuger3 = scanner.nextInt();
         int intuger4 = scanner.nextInt();

         int result = 0;

         result = ((intuger1+intuger2)/ intuger3)*intuger4;

        System.out.println(result);

    }

}
