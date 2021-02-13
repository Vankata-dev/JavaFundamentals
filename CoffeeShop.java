import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;


        for (int i = 0; i < orders; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsules = Integer.parseInt(scanner.nextLine());
            double priceOfCoffee = ((days*capsules) * pricePerCapsule);
            System.out.printf("The price for the coffee is: $%.2f\n",priceOfCoffee );
            totalPrice += priceOfCoffee;
        }

        System.out.printf("Total: $%.2f",totalPrice);

    }

}
