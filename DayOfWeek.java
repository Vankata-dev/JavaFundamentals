import java.util.Scanner;

public class DayOfWeek {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());

        if (day >= 1 && day <= 7) {

            String [] dayOfWeek = new String[8];
            dayOfWeek [1]= "Monday";
            dayOfWeek [2]= "Tuesday";
            dayOfWeek [3]= "Wednesday";
            dayOfWeek [4]="Thursday";
            dayOfWeek [5]= "Friday";
            dayOfWeek [6]= "Saturday";
            dayOfWeek [7]= "Sunday";

            System.out.println(dayOfWeek[day]);
        }else {
            System.out.println("Invalid day!");
        }


    }
}
