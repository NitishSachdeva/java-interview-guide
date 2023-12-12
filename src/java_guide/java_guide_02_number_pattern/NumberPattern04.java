/**
 * Java program to print below patterns
 * Pattern 1 - >
           1
           2 1
           3 2 1
           4 3  2 1
*/

package java_guide.java_guide_02_number_pattern;

public class NumberPattern04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}