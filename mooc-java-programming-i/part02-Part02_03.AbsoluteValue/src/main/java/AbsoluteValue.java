
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a mi,ber: ");
        double number = Double.valueOf(scanner.nextLine());
        if(number<0){
            number = number * -1;
            System.out.println(number);
        } else {
            System.out.println(number);
        }

    }
}
