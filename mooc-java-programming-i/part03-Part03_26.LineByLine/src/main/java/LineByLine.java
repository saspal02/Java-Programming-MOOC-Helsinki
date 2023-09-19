
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String userinput = scanner.nextLine();

            String[] SplitStringArray = userinput.split(" ");

            for (String s : SplitStringArray) {
                System.out.println(s);
            }
            if (userinput.equals("")) {
                break;
            }
        }
    }

}
