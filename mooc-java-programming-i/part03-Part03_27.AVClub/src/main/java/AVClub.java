
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("")) {
                return;
            }
            String[] pieces = input.split(" ");

            for (int i = 0; i < pieces.length; i++) {
                if (pieces[i].contains("av")) {
                    System.out.println(pieces[i]);
                }

            }


        }
    }
}