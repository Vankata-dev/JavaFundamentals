import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(smallestOfNumbers(scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));

    }

    private static int smallestOfNumbers (int first, int second, int third) {

        if (first > second && third > second){
            return  second;
        }else if (first < second && third > first){
            return  first;
        }else {
            return third;
        }

    }

}
