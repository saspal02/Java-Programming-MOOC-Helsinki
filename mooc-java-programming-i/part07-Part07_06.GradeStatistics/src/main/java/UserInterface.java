import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private GradeRegister register;

    public UserInterface(Scanner scanner, GradeRegister register) {
        this.scanner = scanner;
        this.register = register;
    }

    public void start() {
        readPoints();
        System.out.println("");
        printAverage();
        printAveragePassing();
        printPassingPercentage();
        printGradeDistribution();
    }

    public void readPoints() {

        System.out.println("Enter points totals, -1 stops:");

        while (true) {

            String input = scanner.nextLine();

            int points = Integer.valueOf(input);

            if (points == -1) {
                break;
            }

            if (points < 0 || points > 100) {
                continue;
            }

            this.register.addPoints(points);
        }
    }

    public void printAverage() {
        System.out.println("Point average (all): " + register.averageOfPoints());
    }
    public void printAveragePassing() {

        String nonePassing = "-";

        if (register.averageOfPassingPoints() == 0.00) {
            System.out.println("Point average (passing): " + nonePassing);
        } else {
            System.out.println("Point average (passing): " + register.averageOfPassingPoints());
        }
    }

    public void printPassingPercentage() {
        System.out.println("Pass percentage: " + register.passPercentage());
    }

    public void printGradeDistribution() {

        System.out.println("Grade distribution:");

        int grade = 5;

        while (grade >= 0) {
            int stars = register.totalGradesFromPoints(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");

            grade--;
        }
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}

