import java.util.Arrays;
import java.util.Scanner;

public class WarShips {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int[] pirateShip = Arrays.stream(scanner.nextLine().split("\\>+")).mapToInt(element -> Integer.parseInt(element)).toArray();


        int[] warShip = Arrays.stream(scanner.nextLine().split("\\>+")).mapToInt(element -> Integer.parseInt(element)).toArray();


        int maxHealth = Integer.parseInt(scanner.nextLine());
        String commands = scanner.nextLine();

        while (!commands.equals("Retire")) {
            String[] action = commands.split("\\s+");

            boolean end = false;

            switch (action[0]) {
                case "Fire":
                    int index = Integer.parseInt(action[1]);
                    int dmg = Integer.parseInt(action[2]);
                    if (index >= 0 && index < warShip.length) {
                        warShip[index] = warShip[index] - dmg;
                        if (warShip[index] <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            end = true;
                            break;

                        }
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(action[1]);
                    int endIndex = Integer.parseInt(action[2]);
                    dmg = Integer.parseInt(action[3]);
                    if (0 <= startIndex && pirateShip.length > startIndex && pirateShip.length > (startIndex + endIndex)) {
                        boolean hasSunken = false;
                        for (int i = startIndex; i <= endIndex; i++) {
                            pirateShip[i] = pirateShip[i] - dmg;
                            if (pirateShip[i] <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                hasSunken = true;
                                break;
                            }
                        }
                        if (hasSunken) {
                            end = true;
                            break;
                        }
                    }
                    break;
                case "Repair":
                    int current = Integer.parseInt(action[1]);
                    int health = Integer.parseInt(action[2]);
                    if (current >= 0 && current < pirateShip.length) {
                        pirateShip[current] = pirateShip[current] + health;
                        if (pirateShip[current] > maxHealth) {
                            pirateShip[current] = maxHealth;
                        }
                    }
                    break;
                case "Status":
                    int repair = 0;
                    double percentageOfMaxHealth = maxHealth * 0.2;

                    for (int i = 0; i < pirateShip.length; i++) {
                        if (pirateShip[i] < percentageOfMaxHealth) {
                            repair++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", repair);
                    break;
            }
            if (end) {
                break;
            }
            commands = scanner.nextLine();
        }
        if (commands.equals("Retire")) {
            int sum = 0;
            for (int i = 0; i < pirateShip.length; i++) {
                sum = sum + pirateShip[i];
            }

            int warShipSum = 0;
            for (int i = 0; i < warShip.length; i++) {
                warShipSum = warShipSum + warShip[i];
            }
            System.out.printf("Pirate ship status: %d%nWarship status: %d%n", sum, warShipSum);
        }
    }
}

