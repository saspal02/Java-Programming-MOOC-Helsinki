
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter number: ");
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            }

            if (input > 0) {
                sum = input + sum;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else  {
            System.out.println((1.0 * sum )/ count);
        }

    }
}
