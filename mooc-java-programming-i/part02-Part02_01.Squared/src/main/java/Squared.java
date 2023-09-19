
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = Double.valueOf(scanner.nextLine());
        double square = number*number;
        System.out.println(square);

    }
}
