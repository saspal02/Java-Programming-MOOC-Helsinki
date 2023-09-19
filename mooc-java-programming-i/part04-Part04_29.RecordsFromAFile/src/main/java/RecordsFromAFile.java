
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String filename = scanner.nextLine();

        try(Scanner filescanner = new Scanner(Paths.get(filename))) {

            while (filescanner.hasNextLine()) {

                String line = filescanner.nextLine();
                String[] parts = line.split(",");

                if(parts.equals("")) {
                    continue;
                }
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);


                if (age > 1 || age == 0) {
                    System.out.println(name + ", age: " + age + " years");
                } else {
                    System.out.println(name + ", age: " + age + " year");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}



