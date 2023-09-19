import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] StrArray = {"banana","apple","orange","Grapes","Strawberry"};

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(9);
        intList.add(1);

        ArrayList<String> StringList = new ArrayList<>();
        StringList.add("Bus");
        StringList.add("Bike");
        StringList.add("Car");
        StringList.add("Truck");
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(array);
    }

    public static void sort(String[] StrArray) {
        System.out.println(Arrays.toString((StrArray)));
        Arrays.sort(StrArray);
        System.out.println(Arrays.toString(StrArray));
    }

    public static void sortIntegers(ArrayList<Integer> intList) {
        System.out.println(intList);
        Collections.sort(intList);
        System.out.println(intList);
    }

    public static void sortStrings(ArrayList<String> StringList) {
        System.out.println(StringList);
        Collections.sort(StringList);
        System.out.println(StringList);
    }

}
