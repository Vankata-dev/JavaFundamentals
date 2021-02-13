import java.util.Random;
        import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Random random = new Random();

        for (int i = 0; i <input.length ; i++) {
            System.out.println(input[random.nextInt(input.length)]);
        }
    }
}
