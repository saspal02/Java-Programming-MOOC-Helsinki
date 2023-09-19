
import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0 ) {
                break;
            }
            if (number > 0) {
                count++;
                sum = sum + number;
            }
        }
        if (count>0) {
            double average = (sum*1.0)/count;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}