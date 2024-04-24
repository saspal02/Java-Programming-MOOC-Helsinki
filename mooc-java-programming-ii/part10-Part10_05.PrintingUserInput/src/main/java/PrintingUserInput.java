
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userInputList = new ArrayList<>();

        System.out.println("Enter strings (press Enter to stop)");

        while(true) {
            String input = scanner.nextLine();

            if(input.isEmpty()) {
                break;
            }

            userInputList.add(input);
        }

        System.out.println("\nUser inputs");
        userInputList.forEach(System.out::println);

        scanner.close();

    }
}
