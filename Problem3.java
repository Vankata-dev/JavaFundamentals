import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> sentMessages = new HashMap<>();
        Map<String, Integer> receivedMessages = new HashMap<>();

        int capacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Statistics")){
            String[] tokens = input.split("=");
            String command = tokens[0];
            String username = tokens[1];

            switch (command){
                case "Add":
                    if (sentMessages.containsKey(username)){
                        continue;
                    }
                    int sent = Integer.parseInt(tokens[2]);
                    int received = Integer.parseInt(tokens[3]);
                    sentMessages.put(username, sent);
                    receivedMessages.put(username, received);
                    break;
                case "Message":
                    String sender = tokens[1];
                    String receiver = tokens[2];
                    if (sentMessages.containsKey(sender) && receivedMessages.containsKey(receiver)){
                      sentMessages.put(sender, sentMessages.get(sender) + 1);
                      if ((sentMessages.get(sender) + receivedMessages.get(sender)) == capacity) {
                          System.out.printf("%s reached the capacity!\n", sender);
                          sentMessages.remove(sender);
                      }
                        receivedMessages.put(receiver, receivedMessages.get(receiver) + 1);
                        if ((receivedMessages.get(receiver) + sentMessages.get(receiver)) == capacity) {
                            System.out.printf("%s reached the capacity!\n", receiver);
                            receivedMessages.remove(receiver);
                        }

                    }

                case "Empty":
                    if (username.equals("All")){
                        sentMessages.clear();
                        receivedMessages.clear();
                    }
                    sentMessages.put(username, 0);
                    receivedMessages.put(username, 0);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Users count: %d%n",sentMessages.size());
        Stream<Map.Entry<String, Integer>> sorted = receivedMessages.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed());
        sorted.forEach((entry) -> System.out.printf("%s - %d\n", entry.getKey(), entry.getValue() + sentMessages.get(entry.getKey()))
        );


    }
}
