import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String surName = scanner.nextLine();
        String delimeter = scanner.nextLine();

        System.out.printf("%s%s%s%n", name,delimeter,surName);

    }
}
