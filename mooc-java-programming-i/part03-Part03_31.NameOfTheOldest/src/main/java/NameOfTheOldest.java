
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        int age = 0;
        String oldestName = "";
        String name = "";
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            age = Integer.valueOf(pieces[1]);
            name = pieces[0];
            if(age>oldest) {
                oldest = age;
                oldestName = name;
            }
        }
        System.out.println("Name of the oldest: "+oldestName);


    }
}
