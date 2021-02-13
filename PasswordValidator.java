import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        boolean sixToTen = sixToTenSymbols(password);
        boolean lettersOrDigits = onlyLettersOrDigits(password);
        boolean ifTwoDigits = checkIfHaveTwoDigits(password);

        if (sixToTenSymbols(password) && onlyLettersOrDigits(password) && checkIfHaveTwoDigits(password)){
            System.out.println("Password is valid");
        }
        if (!sixToTen){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!lettersOrDigits){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!ifTwoDigits){
            System.out.println("Password must have at least 2 digits");
        }

    }

    public static boolean sixToTenSymbols(String input) {
        return (input.length() >= 6 && input.length() <= 10);
    }

    public static boolean onlyLettersOrDigits(String input) {
        for (int i = 0; i <input.length() ; i++) {
            char symbol = input.charAt(i);
            boolean isLeather = Character.isLetter(symbol);
            boolean isDigit = Character.isDigit(symbol);

            if (!isDigit && !isLeather){
                return false;
            }
        }
        return true;
    }

    public static boolean checkIfHaveTwoDigits (String input){

        int counter = 0;

        for (int i = 0; i <input.length() ; i++) {
            char symbol = input.charAt(i);
            if (Character.isDigit(symbol)){
                counter++;
            }
        }
        if (counter >=2){
            return true;
        }
        return false;
    }


}
