import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {

    public static class  Person{
        String name;
        int age;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString(){
            return String.format("%s - %d",getName(), getAge());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> pearsonList = new ArrayList<>();

        int numbOfPeople = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbOfPeople ; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person person = new Person(name, age);

            pearsonList.add(person);
        }
        pearsonList.stream().filter(person -> person.getAge() >30).sorted((p1, p2)->p1.getName().compareTo(p2.getName())).
                forEach(person -> System.out.println(person.toString()));
    }
}
