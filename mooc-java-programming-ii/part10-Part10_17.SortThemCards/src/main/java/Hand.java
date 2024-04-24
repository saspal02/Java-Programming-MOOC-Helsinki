import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;
    public Hand() {
        this.hand = new ArrayList<>();
    }
    public void add(Card card) {
        this.hand.add(card);
    }
    public void print() {
        Iterator<Card> iterator = this.hand.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public void sort() {
        Collections.sort(this.hand);
    }
    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
    public int sum() {
        int sum = 0;

        for (Card card: this.hand) {
            sum += card.getValue();
        }

        return sum;
    }
    public int compareTo(Hand compared) {
        if (compared.sum() == this.sum()) {
            return 0;
        }
        return this.sum() - compared.sum();
    }


}
