
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter your numbers: ");
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1) {
                break;
            }

            list.add(input);
        }
        int sum = 0;
         for(int i = 0; i < list.size(); i++) {
             sum = sum + list.get(i);
         }
         double average  = sum * (1.0) / list.size();
        System.out.println("Average: " +average);

    }
}
