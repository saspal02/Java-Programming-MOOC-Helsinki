import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageFacility;

    public StorageFacility() {
        this.storageFacility = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (!storageFacility.containsKey(unit)) {
            storageFacility.put(unit, new ArrayList<>());
        }
        storageFacility.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (storageFacility.containsKey(storageUnit)) {
            return new ArrayList<>(storageFacility.get(storageUnit));
        } else {
            return new ArrayList<>();
        }
    }

    public void remove(String storageUnit, String item) {
        if (storageFacility.containsKey(storageUnit)) {
            ArrayList<String> itemsInUnit = this.storageFacility.get(storageUnit);
            itemsInUnit.remove(item);

            if (itemsInUnit.isEmpty()) {
                storageFacility.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        return new ArrayList<>(storageFacility.keySet());

    }
}
