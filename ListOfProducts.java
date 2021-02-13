import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>(lines);
        for (int i = 0; i < lines ; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }

        Collections.sort(products);
        for (int i = 0; i < products.size() ; i++) {
            String product = products.get(i);
            System.out.println((i+1) + "."+ product);
        }

    }
}
