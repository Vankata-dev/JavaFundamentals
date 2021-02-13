import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double totalMoney = 0;

        while (!input.equals("Start")) {
            double currentCoins = Double.parseDouble(input);
            if (currentCoins == 0.1 || currentCoins == 0.2 || currentCoins == 0.5 || currentCoins == 1 || currentCoins == 2) {
                totalMoney += currentCoins;
            } else {
                System.out.printf("Cannot accept %.2f%n", currentCoins);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("End")) {
            switch (input) {
                case ("Nuts"):
                    if (totalMoney >= 2.0) {
                        System.out.printf("Purchased %s%n", input);
                        totalMoney -= 2.0;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case ("Water"):
                    if (totalMoney >= 0.7) {
                        System.out.printf("Purchased %s%n", input);
                        totalMoney -= 0.7;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case ("Crisps"):
                    if (totalMoney >= 1.5) {
                        System.out.printf("Purchased %s%n", input);
                        totalMoney -= 1.5;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case ("Soda"):
                    if (totalMoney >= 0.8) {
                        System.out.printf("Purchased %s%n", input);
                        totalMoney -= 0.8;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case ("Coke"):
                    if (totalMoney >= 1.0) {
                        System.out.printf("Purchased %s%n", input);
                        totalMoney -= 1.0;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                default:
                    System.out.printf("Invalid product%n");
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f",totalMoney);
    }
}
