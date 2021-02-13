import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        int[] peopleInWagon = new int[wagons];
        int people = 0;

        for (int i = 0; i < wagons; i++) {
            peopleInWagon[i] = Integer.parseInt(scanner.nextLine());
            people += peopleInWagon[i];
        }

        for (int i = 0; i < wagons;i++){
            System.out.print(peopleInWagon[i]+ " ");
  }
        System.out.println();

        System.out.println(people);
    }
}
