
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("First name: ");
            String firstname = scanner.nextLine();
            if(firstname.isEmpty()) {
                break;
            }

            System.out.println("Last name: ");
            String lastname = scanner.nextLine();

            System.out.println("Identification number: ");
            String Id =  scanner.nextLine();

            infoCollection.add(new PersonalInformation(firstname,lastname,Id));

            for(int i = 0; i < infoCollection.size(); i++) {
                PersonalInformation information = infoCollection.get(i);
                System.out.println(information.getFirstName()+" "+ information.getLastName());
            }


        }

    }
}
