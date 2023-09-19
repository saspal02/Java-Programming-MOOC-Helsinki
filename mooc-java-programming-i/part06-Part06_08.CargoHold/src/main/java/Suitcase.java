import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;

    private ArrayList<Item> items = new ArrayList<>();

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item e : items) {
            totalWeight = totalWeight + e.getWeight();
        }
        return totalWeight;
    }

    public void printItems() {
        for (Item e : items) {
            System.out.println(e);
        }
    }

    public Item heaviestItem() {
        if(items.isEmpty()) {
            return null;
        }
        Item heaviest = items.get(0);
        for (Item e : items) {
            if (e.getWeight() > heaviest.getWeight()) {
                heaviest = e;
            }
        }
        return heaviest;
    }


    public String toString() {
        if(items.size() == 0) {
            return items.size() + "no items (" + totalWeight() + " kg)";
        } else if(items.size() == 1) {
            return items.size() + "item (" + totalWeight() + " kg)";
        } else {
            return items.size() + "items (" + totalWeight() + " kg)";
        }
    }
}
