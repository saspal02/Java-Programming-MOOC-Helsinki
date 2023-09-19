import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList tasks;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.tasks = todoList;
        this.scanner = scanner;
    }
    public void start() {
        while(true) {
            System.out.println("Command:");
            String userCmd = scanner.nextLine();
            if (userCmd.equals("add")) {
                System.out.println("To add");
                String add = scanner.nextLine();
                tasks.add(add);
            } else if (userCmd.equals("list")) {
                tasks.print();
            } else if (userCmd.equals("remove")) {
                System.out.println("Which one is removed? ");
                int id = Integer.valueOf(scanner.nextLine());
                tasks.remove(id);
            } else if(userCmd.equals("stop")) {
                break;
            }
        }
    }
}
