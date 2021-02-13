import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getMultuplpleOfEvenAndOdds(scanner.nextInt()));
    }

    public static int getMultuplpleOfEvenAndOdds (int number ){
        int evenSum = 0;
        int oddSum = 0;
        int currentNumber = 1;


        for (int i = 0; !(currentNumber == 0); i++) {
            currentNumber = number % 10;
            if (currentNumber % 2 == 0){
                evenSum += currentNumber;
            }else {
                oddSum += currentNumber;
            }
            number = number / 10;
        }
        return evenSum * oddSum;
    }


}
