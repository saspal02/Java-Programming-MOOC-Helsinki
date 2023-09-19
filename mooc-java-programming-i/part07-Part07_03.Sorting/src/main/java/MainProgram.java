import java.util.Arrays;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {3, 1, 5, 99, 3, 12};
        System.out.println("Smallest: " + MainProgram.smallest(numbers));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));

        MainProgram.sort(numbers);

    }

    public static int smallest(int[] numbers) {
        int smallestValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] < smallestValue) {
                smallestValue = numbers[i];
            }

        }
        return smallestValue;
    }

    public static int indexOfSmallest(int[] numbers) {
        int smallestIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == smallest(numbers)) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < table[smallestIndex]) {
                smallestIndex = i;
            }

        }
        return smallestIndex;
    }

    public static void swap(int[] numbers, int index1, int index2) {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }

    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println(numbers);
            swap(numbers,i,indexOfSmallestFrom(numbers,i));
        }
    }
}
