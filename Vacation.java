import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double totalAmount = 0;
        double amountPerPerson = 0;

        switch (dayOfWeek) {
            case "Friday":
                switch (group) {
                    case "Students":
                        if (people >= 30) {
                            totalAmount = (people * 8.45) - ((people * 8.45) * 0.15);
                        } else {
                            totalAmount = people * 8.45;
                        }
                        break;
                    case "Business":
                        if (people < 100) {
                            totalAmount = people * 10.90;
                            amountPerPerson = totalAmount / people;
                        } else {
                            amountPerPerson = (people * 10.9) / people;
                            totalAmount = (people * 10.90) - (10 * amountPerPerson);
                        }
                        break;
                    case "Regular":
                        if (people >= 10 && people <= 20) {
                            totalAmount = (people * 15) - ((people * 15) * 0.05);
                        } else {
                            totalAmount = people * 15;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (group) {
                    case "Students":
                        if (people >= 30) {
                            totalAmount = (people * 9.80) - ((people * 9.80) * 0.15);
                        } else {
                            totalAmount = people * 9.80;
                        }
                        break;
                    case "Business":
                        if (people < 100) {
                            totalAmount = people * 15.60;
                            amountPerPerson = totalAmount / people;
                        } else {
                            amountPerPerson = (people * 15.60) / people;
                            totalAmount = (people * 15.60) - (10 * amountPerPerson);
                        }
                        break;
                    case "Regular":
                        if (people >= 10 && people <= 20) {
                            totalAmount = (people * 20) - ((people * 20) * 0.05);
                        } else {
                            totalAmount = people * 20;
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (group) {
                    case "Students":
                        if (people >= 30) {
                            totalAmount = (people * 10.46) - ((people * 10.46) * 0.15);
                        } else {
                            totalAmount = people * 10.46;
                        }
                        break;
                    case "Business":
                        if (people < 100) {
                            totalAmount = people * 16;
                            amountPerPerson = totalAmount / people;
                        } else {
                            amountPerPerson = (people * 16) / people;
                            totalAmount = (people * 16) - (10 * amountPerPerson);
                        }
                        break;
                    case "Regular":
                        if (people >= 10 && people <= 20) {
                            totalAmount = (people * 22.50) - ((people * 22.50) * 0.05);
                        } else {
                            totalAmount = people * 22.50;
                        }
                        break;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalAmount);
    }
}
