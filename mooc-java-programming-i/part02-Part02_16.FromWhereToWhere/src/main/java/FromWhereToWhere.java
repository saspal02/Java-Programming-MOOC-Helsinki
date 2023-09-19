
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int finishnum =  Integer.valueOf(scanner.nextLine());

        System.out.println("Where from?");
        int startnum = Integer.valueOf(scanner.nextLine());

        for (int i = startnum; i<=finishnum; i++ ) {
            System.out.println(i);
        }

    }
}
