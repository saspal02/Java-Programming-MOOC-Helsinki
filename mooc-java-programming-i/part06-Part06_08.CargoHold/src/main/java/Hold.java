import java.util.ArrayList;

public class Hold {
    private int maxWeight;

    private ArrayList<Suitcase> suitcases = new ArrayList<>();

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    public int totalweight() {
        int SuitcasesWeight = 0;
        for(Suitcase e: suitcases) {
            SuitcasesWeight = SuitcasesWeight + e.totalWeight();
        }
        return SuitcasesWeight;
    }
    public void addSuitcase(Suitcase suitcase) {
        if(totalweight() + suitcase.totalWeight() <= maxWeight)
        suitcases.add(suitcase);
    }
    public void printItems() {
        for(Suitcase e: suitcases) {
            e.printItems();
        }
    }
    public String toString() {
        return suitcases.size() +"suitcases ("+totalweight()+ " kg)";
    }
}
