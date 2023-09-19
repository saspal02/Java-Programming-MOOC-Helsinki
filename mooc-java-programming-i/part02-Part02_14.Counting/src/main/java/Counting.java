
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int number = Integer.valueOf(scanner.nextLine());
        int i = 0;
        while(i<=number) {
            System.out.println(i);
            i++;
        }

    }
}
