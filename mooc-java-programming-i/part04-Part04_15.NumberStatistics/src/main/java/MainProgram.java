
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics total = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();

        System.out.println("Enter numbers: ");

        while (true) {

            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == -1) {
                break;
            }
            total.addNumber(userInput);

            if (userInput % 2 == 0) {
                even.addNumber(userInput);
            } else {
                odd.addNumber(userInput);
            }

        }
        System.out.println("Sum: " + total.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());

    }

}
