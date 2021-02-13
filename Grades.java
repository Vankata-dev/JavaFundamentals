import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printGrade(scanner.nextDouble());
    }

    public static void printGrade(double grade) {

        String gradeAsString = "";

        if (grade >= 2.00 && grade <= 2.99) {
            gradeAsString = "Fail";
        }
        if (grade >= 3.00 && grade <= 3.49) {
            gradeAsString = "Poor";
        }
        if (grade >= 3.50 && grade <= 4.49) {
            gradeAsString = "Good";
        }
        if (grade >= 4.50 && grade <= 5.49) {
            gradeAsString = "Very good";
        }
        if (grade >= 5.50 && grade <= 6.00) {
            gradeAsString = "Excellent";
        }
        System.out.println(gradeAsString);

    }
}
