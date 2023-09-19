
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String filename = scan.nextLine();

        System.out.println("Team: ");
        String teamName = scan.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;

        try(Scanner filescanner = new Scanner((Paths.get(filename)))) {

            while(filescanner.hasNextLine()) {
                String[] parts = filescanner.nextLine().split(",");

                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.parseInt(parts[2]);
                int VisitingTeamPoints = Integer.parseInt(parts[3]);

                if (homeTeam.equals(teamName)) {
                    games++;
                    if (homeTeamPoints > VisitingTeamPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                if (visitingTeam.equals(teamName)) {
                    games++;
                    if (VisitingTeamPoints > homeTeamPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }

            System.out.println("Games: "+games);
            System.out.println("Wins: "+wins);
            System.out.println("Losses: "+losses);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
