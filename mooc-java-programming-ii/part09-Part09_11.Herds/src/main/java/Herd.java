import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> herdMembers;
    public Herd() {
        this.herdMembers = new ArrayList<>();
    }
    public void addToHerd(Movable movable) {
        herdMembers.add(movable);
    }
    public String toString() {
        String newString = "";

        for (Movable mov : herdMembers) {

            newString += mov.toString().trim() + "\n";
        }

        return newString;



    }
    public void move(int dx , int dy) {
        for (Movable member : herdMembers) {
            member.move(dx,dy);
        }

    }
}
