
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        String longestName = "";
        String name = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            name = pieces[0];
            if (name.length() > longestName.length()) {
                longestName = name;
            }
            for (int i = 0; i < pieces.length; i++) {
                sum = sum + Integer.valueOf(pieces[1]);
                count++;
            }
        }
            System.out.println("Longest name: " + longestName);
            System.out.println("Average of the birth years: " + (1.0 * sum) / count);

    }
}
