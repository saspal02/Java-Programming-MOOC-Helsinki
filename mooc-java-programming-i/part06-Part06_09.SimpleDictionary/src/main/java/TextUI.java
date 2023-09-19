import java.util.Scanner;

public class TextUI {
    private Scanner scanner;

    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String userCmd = scanner.nextLine();

            if (userCmd.equals("end")) {
                System.out.println("Bye bye!");
                break;

            } else if (userCmd.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                simpleDictionary.add(word, translation);

            } else if(userCmd.equals("search")) {
                System.out.println("To be translated:");
                String ToBeTranslated = scanner.nextLine();
                String translation = simpleDictionary.translate(ToBeTranslated);
                if(translation == null) {
                    System.out.println("Word " + ToBeTranslated + " was not found");
                } else {
                    System.out.println("Translation: " + translation);
                }

            } else {
                System.out.println("Unknown command");
            }
        }
    }

}
