/**
 * Search for an element in a given java_guide.array
 */


package data_structures.algos;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int key = 3;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                temp =temp + 1;
            }
        }

        if (temp == 0)
            System.out.println("Element not found");
    }
}
