import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printVowelsCount(scanner.nextLine());
    }

    public static void printVowelsCount (String input){
        int vowels = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar =  input.toLowerCase().charAt(i);

            // a, e, o, u, i,
            switch (currentChar){
                case 'a':
                    vowels++;
                    break;
                case 'e':
                    vowels++;
                    break;
                case 'o':
                    vowels++;
                    break;
                case 'u':
                    vowels++;
                    break;
                case 'i':
                    vowels++;
                    break;
            }
        }
        System.out.println(vowels);
    }

}
