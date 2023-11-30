/**
 * Java program to print below patterns
 * Pattern 1 - >
                          1
                          4 5 6
                          2 3
                          7 8 9 10
 */

package number_pattern;

public class NumberPattern07 {
    public static void main(String[] args) {
        int k = 3;
        int n = 4;
        int a = 1;
        int t = 4;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print(a++ + " ");
                }
            } else {
                for (int j = 1; j <= k; j++) {
                    System.out.print(t++);
                    k++;
                }
            }
        }
    }
}
