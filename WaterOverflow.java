import java.util.Scanner;

public class WaterOverflow {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int tankCapacity = 255;
        int numberOfTanks = Integer.parseInt(scanner.nextLine());
        int litersInside = 0;

        for (int i = 1 ; i <= numberOfTanks; i++){
            int liters = Integer.parseInt(scanner.nextLine());


            if (liters >= tankCapacity){
                System.out.println("Insufficient capacity!");
            }
            if (liters == tankCapacity || liters<tankCapacity){
                litersInside += liters;
                tankCapacity -= liters;
            }

        }
        System.out.println(litersInside);
    }
}
