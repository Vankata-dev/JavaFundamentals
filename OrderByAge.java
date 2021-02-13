import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {

    public static class Person {
        String name;
        int id;
        int age;

        public Person(String name, int id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public int getAge() {
            return age;
        }

        public String toString(){
            return String.format("%s with ID: %d is %d years old.\n",getName(),getId(),getAge());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> people = new ArrayList<>();

        while (!input.equals("End")){
            String[] tokens = input.split(" ");

            String name = tokens[0];
            int id = Integer.parseInt(tokens[1]);
            int age = Integer.parseInt(tokens[2]);

            Person person = new Person(name, id, age);

            people.add(person);

            input = scanner.nextLine();
        }
        people.stream().sorted((p1, p2)-> Integer.compare(p1.getAge(), p2.getAge())).forEach(person ->
                System.out.print(person.toString()));
    }
}
