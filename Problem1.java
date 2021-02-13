import java.util.List;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();

        String command = scanner.nextLine();

        String newEmail = email;
        while (!command.equals("Complete")){
            switch (command){
                case "Make Upper":
                    newEmail = newEmail.toUpperCase();
                    System.out.println(String.format(newEmail));
                    break;
                case "Make Lower":
                    newEmail = newEmail.toLowerCase();
                    System.out.println(String.format(newEmail));
                    break;
                case "GetUsername":
                    int atIndex = newEmail.indexOf("@");
                    if (atIndex == -1){
                        System.out.printf("The email %s doesn't contain the @ symbol.\n", newEmail);
                        break;
                    }
                    System.out.println(newEmail.substring(0, atIndex));
                    break;
                case "Encrypt":

                    for (int i = 0; i <email.length() ; i++) {
                      int symbol = (int) newEmail.charAt(i);
                      System.out.print(symbol + " ");
                    }
                    break;

                default:
                    String[] token = command.split(" ");
                    if (token[0].equals("GetDomain")){
                        int count = Integer.parseInt(token[1]);
                        System.out.println(newEmail.substring(newEmail.length() - count));
                    }else if (token[0].equals("Replace")){
                        System.out.println(newEmail.replaceAll(token[1], "-"));
                    }

            }
            command = scanner.nextLine();
        }
    }
}

