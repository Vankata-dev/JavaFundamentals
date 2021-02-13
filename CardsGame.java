
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> playerOneDeck = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> playerTwoDeck = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        while (!(playerOneDeck.isEmpty() || playerTwoDeck.isEmpty())) {
            int playerOneCard = 0;
            int playerTwoCard = 0;
            for (Integer card : playerOneDeck) {
                playerOneCard = card;
                break;
            }
            for (Integer card : playerTwoDeck) {
                playerTwoCard = card;
                break;
            }
            if (playerOneCard > playerTwoCard) {
                playerTwoDeck.remove(0);
                playerOneDeck.remove(0);
                playerOneDeck.add(playerOneCard);
                playerOneDeck.add(playerTwoCard);
            } else if (playerOneCard == playerTwoCard) {
                playerOneDeck.remove(0);
                playerTwoDeck.remove(0);
            } else {
                playerOneDeck.remove(0);
                playerTwoDeck.remove(0);
                playerTwoDeck.add(playerTwoCard);
                playerTwoDeck.add(playerOneCard);
            }
        }
        int sumOfCards = 0;
        if (playerOneDeck.size() > playerTwoDeck.size()) {
            for (Integer card : playerOneDeck) {
                sumOfCards += card;
            }
            System.out.printf("First player wins! Sum: %d", sumOfCards);
        } else {
            for (Integer card : playerTwoDeck) {
                sumOfCards += card;
            }
            System.out.printf("Second player wins! Sum: %d", sumOfCards);
        }
    }
}
