import java.util.ArrayList;
import java.util.Map;

public class HashMap<K, V> {
    private ArrayList<ArrayList<Map.Entry<K, V>>> values;

    public HashMap() {
        this.values = new ArrayList<>();
        for (int i = 0; i < 10; i++) { // Initialize with 10 buckets
            this.values.add(new ArrayList<>());
        }
    }

    public void put(K key, V value) {
        int index = Math.abs(key.hashCode() % values.size());
        ArrayList<Map.Entry<K, V>> bucket = values.get(index);
        for (Map.Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }
        bucket.add(new java.util.AbstractMap.SimpleEntry<>(key, value));
    }

    public V get(K key) {
        int index = Math.abs(key.hashCode() % values.size());
        ArrayList<Map.Entry<K, V>> bucket = values.get(index);
        for (Map.Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public boolean containsKey(K key) {
        int index = Math.abs(key.hashCode() % values.size());
        ArrayList<Map.Entry<K, V>> bucket = values.get(index);
        for (Map.Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public void remove(K key) {
        int index = Math.abs(key.hashCode() % values.size());
        ArrayList<Map.Entry<K, V>> bucket = values.get(index);
        for (Map.Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                bucket.remove(entry);
                return;
            }
        }
    }
}
