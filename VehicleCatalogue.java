import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {

    public static class Vehicle {
        String type;
        String model;
        String color;
        int horsePower;

        public Vehicle(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public String toString() {
            return String.format("Type: %s%n" + "Model: %s%n" + "Color: %s%n" + "Horsepower: %d%n",
                    getType().toUpperCase().charAt(0) + getType().substring(1), getModel(), getColor(), getHorsePower());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Vehicle> vehicleList = new ArrayList<>();

        int carCounter = 0;
        double carHoursePower = 0;
        int trucCounter = 0;
        double trucHoursePower = 0;


        while (!input.equals("End")) {
            String[] tokens = input.split(" ");
            String type = tokens[0];
            String model = tokens[1];
            String color = tokens[2];
            int horsePower = Integer.parseInt(tokens[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsePower);

            vehicleList.add(vehicle);
            if (type.equals("car")){
                carCounter++;
                carHoursePower+= horsePower;
            }else {
                trucCounter++;
                trucHoursePower += horsePower;
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("Close the Catalogue")) {
            String model = input;
            vehicleList.stream().filter(vehicle -> vehicle.getModel().equals(model)).forEach(vehicle -> System.out.print(
                    vehicle.toString()
            ));

            input = scanner.nextLine();
        }

        double avrgPowerCars = carHoursePower / carCounter;
        double avrgPowerTrucs = trucHoursePower / trucCounter;

        System.out.printf("Cars have average horsepower of: %.2f.%n",avrgPowerCars);
        System.out.printf("Trucks have average horsepower of: %.2f.",avrgPowerTrucs);

    }
}
