//what is binary search?
//It is an optimized way of searching for an element but this only works in a sorted java_guide.array. If java_guide.array is not sorted then we have to sort it first and then apply binary search.
//It is better than the linear search as it has a time complexity of O(logn) whereas linear search has O(n) time complexity.

package data_structures.algos;

import java.util.Arrays;

public class BinarySearch_BFS {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int middle;
        //if left exceeds right then the element is not present in the java_guide.array and return -1
        while (left <= right) {
            middle = (left + right) / 2;
            if (arr[middle] == target)
                return middle;
            if (arr[middle] > target)
                right = middle - 1;
            else
                left = middle + 1;
        }
        return -1;
    }

    public static int binarySearchRecursion(int[] arr, int target, int left, int right) {
        if (right < left)
            return -1;
        int middle = (left + right) / 2;
        if (arr[middle] == target)
            return middle;
        if (arr[middle] > target) {
            right = middle - 1;
            return binarySearchRecursion(arr, target, left, right);
        } else {
            left = middle + 1;
            return binarySearchRecursion(arr, target, left, right);
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 5;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

        int ans2 = binarySearchRecursion(arr, target, 0, arr.length - 1);
        System.out.println(ans2);
    }
}
