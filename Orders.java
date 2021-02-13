import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        double quantity = scanner.nextDouble();

        printPrice(product,quantity);
    }

    public static void printPrice(String product, double quantity) {
        double sum = 0;
        switch (product) {
            case "coffee":
                sum = 1.5 * quantity;
                break;
            case "water":
                sum = 1.00 * quantity;
                break;
            case "coke":
                sum = 1.40 * quantity;
                break;
            case "snacks":
                sum = 2.00 * quantity;
                break;
        }
        System.out.printf("%.2f", sum);

    }
}
