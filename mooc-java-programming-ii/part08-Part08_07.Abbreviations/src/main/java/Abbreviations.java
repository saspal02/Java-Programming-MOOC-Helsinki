import java.util.HashMap;

public class Abbreviations {
    private HashMap<String,String> abbreviationMap;

    public Abbreviations() {
        this.abbreviationMap = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviationMap.put(abbreviation,explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (abbreviationMap.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        if (abbreviationMap.containsKey(abbreviation)) {
            return abbreviationMap.get(abbreviation);
        }
        return null;
    }
}
