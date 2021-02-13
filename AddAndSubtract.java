import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        System.out.println(substractThird());
    }


    public static int addFirstTwo(int first, int second) {
        return first + second;
    }

    public static int substractThird() {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        return addFirstTwo(first, second) - third;
    }
}


