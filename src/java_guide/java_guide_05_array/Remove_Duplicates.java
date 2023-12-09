package java_guide.java_guide_05_array;

import java.util.ArrayList;

public class Remove_Duplicates {
    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 8, 8};
        int k = 0;
        //print unique numbers in a given array
        //also print occurrences of number repeated in a given array

        ArrayList<Integer> uniqueList = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
            if (!uniqueList.contains(a[i])) {
                uniqueList.add(a[i]);
//                k++;
//
//                //count the occurences
//                for (int j = i + 1; j < a.length; j++) {
//                    if (a[i] == a[j]) {
//                        k++;
//                    }
//                }
//                System.out.print(a[i] + " repeated \t " + k + " \n");
            }
        }
        System.out.println(uniqueList);
    }
}