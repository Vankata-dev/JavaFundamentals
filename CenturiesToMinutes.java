import java.math.BigDecimal;
import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int century = n;
        int years = n * 100;
        int days = n * 36524;
        long hrs = n * 876576;
        BigDecimal minutes = new BigDecimal(n);
        minutes = minutes.multiply(BigDecimal.valueOf(52594560));

        System.out.println(century+" centuries "+"= "+years+" years "+"= "+days+" = "+hrs+" hours "+ "= "+minutes+" minutes ");
    }
}
