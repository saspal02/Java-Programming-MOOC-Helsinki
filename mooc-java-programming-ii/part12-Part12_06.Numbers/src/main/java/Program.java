
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random printRandom = new Random();

        System.out.println("Enter a number between 0-10: ");
        int input = scanner.nextInt();

        for (int i = 0; i < input; i++) {
            int randomNumber = printRandom.nextInt(11);
            System.out.println(randomNumber);


        }
    }


}
