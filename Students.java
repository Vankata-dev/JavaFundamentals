import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Students {

    public static class Student {
        String firstName;
        String lastName;
        double grade;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getGrade() {
            return grade;
        }

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public  String toString(){
            return String.format("%s %s: %.2f",getFirstName(), getLastName(), getGrade());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < numberOfLines; i++) {
            String[] tokens = scanner.nextLine().split(" ");

            String firstName = tokens[0];
            String lastName = tokens[1];
            double grade = Double.parseDouble(tokens[2]);

            Student student = new  Student(firstName, lastName,grade);

            studentList.add(student);
        }

        studentList.stream().sorted((s1, s2)-> Double.compare(s2.getGrade(), s1.getGrade())).forEach(
        student -> System.out.println(student.toString()));
    }
}
