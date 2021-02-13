import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gameCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double expenses = 0;


        for (int i = 0; i <= gameCount; i++) {
            if (i % 2 == 0) {
                expenses += headsetPrice;
            } else if (0 > i && i % 2 != 0) {
                expenses += mousePrice;
            }
        }
        for (int i = 3; i <= gameCount; i += 3) {
            expenses += keyboardPrice;
        }
        for (int i = 12; i <= gameCount ; i+= 12) {
            expenses += displayPrice;
        }

        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }

}

