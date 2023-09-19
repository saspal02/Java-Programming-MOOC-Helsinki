import java.util.ArrayList;

public class Stack {

    private ArrayList<String> list;

    public Stack() {
        list = new ArrayList<String>();
    }
    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        }
        return false;

    }

    public void add(String value) {
        list.add(value);

    }
    public ArrayList<String> values() {
        return list;
    }
    public String take() {
        return list.remove(this.list.size() - 1);

    }
}
