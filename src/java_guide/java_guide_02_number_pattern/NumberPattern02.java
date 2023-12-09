/**
 * Java program to print below patterns
 * Pattern 1 - >
           1
           2 3
           4 5 6
           7 8 9 10
*/

package java_guide.java_guide_02_number_pattern;

public class NumberPattern02 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                count = count + 1;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
