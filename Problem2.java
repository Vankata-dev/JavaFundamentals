import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= lines ; i++) {
            String input = scanner.nextLine();
            Pattern patern = Pattern.compile("^!([A-Z][a-z]+)!:\\[([A-Za-z]+)\\]");
            Matcher matcher = patern.matcher(input);
            if (!matcher.find()) {
                System.out.println("The message is invalid");
                continue;
            }
            String command = matcher.group(1);
            String message = matcher.group(2);
            if (command.length() < 3 || message.length() < 8) {
                System.out.println("The message is invalid");
                continue;
            }

            List<String> result = new ArrayList<>();

            for (int j = 0; j < message.length(); j++) {
                result.add(String.valueOf((int) message.charAt(j)));
            }

            System.out.printf("%s: %s\n", command, String.join(" ", result));

        }
    }
}
