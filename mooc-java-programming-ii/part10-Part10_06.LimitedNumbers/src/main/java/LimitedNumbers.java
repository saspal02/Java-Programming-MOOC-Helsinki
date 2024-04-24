
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> userInputList = new ArrayList<>();

        System.out.println("Enter strings(press Enter to stop:");

        while(true) {
            int input = scanner.nextInt();

            if(input == -1) {
                break;
            }

            userInputList.add(input);
        }

        userInputList.stream()
                .filter(num -> num >= 1 && num<= 5)
                .forEach(System.out::println);
        scanner.close();



    }
}
