import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SugarCubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sugarCubes = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Mort")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Add":
                    sugarCubes.add(Integer.parseInt(tokens[1]));
                    break;
                case "Remove":
                    for (int i = 0; i < sugarCubes.size(); i++) {
                        if (sugarCubes.get(i) == Integer.parseInt(tokens[1])) {
                            sugarCubes.remove(i);
                            break;
                        }
                    }
                    break;
                case "Replace":
                    for (int i = 0; i < sugarCubes.size(); i++) {
                        if (sugarCubes.get(i) == Integer.parseInt(tokens[1])) {
                            sugarCubes.set(i, Integer.parseInt(tokens[2]));
                            break;
                        }
                    }
                    break;
                case "Collapse":
                    for (int i = 0; i < sugarCubes.size() ; i++) {
                        if (sugarCubes.get(i) < Integer.parseInt(tokens[1])){
                            sugarCubes.remove(i);
                            i = i -1;
                        }
                    }
                    break;


            }
            input = scanner.nextLine();
        }

        for (Integer sugarCube : sugarCubes) {
            System.out.print(sugarCube + " ");
        }

    }

}







