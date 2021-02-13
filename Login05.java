import java.util.Scanner;

public class Login05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String pass = "";
        for (int i = userName.length() - 1; i >= 0; i--) {
            pass += userName.charAt(i);
        }

        int counter = 0;
        while (counter < 4) {
            String input = scanner.nextLine();
            if (input.equals(pass)) {
                System.out.printf("User %s logged in.", userName);
                return;
            } else if (counter < 3) {
                System.out.println("Incorrect password. Try again.");
            }
            counter++;
        }
        if (counter == 4) {
        }


        System.out.printf("User %s blocked!", userName);

    }
}
