
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int number = Integer.valueOf(scanner.nextLine());
        int i;
        for(i = number; i<=100 ; i++) {
            System.out.println(i);
        }

    }
}
