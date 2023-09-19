
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter the names: ");
            String names = scanner.nextLine();
            if(names.isEmpty()) {
                break;
            }
            items.add(new Item(names));

            for(int i = 0; i < items.size(); i++) {
                Item item = items.get(i);
                System.out.println(items.toString());
            }

        }

    }
}
