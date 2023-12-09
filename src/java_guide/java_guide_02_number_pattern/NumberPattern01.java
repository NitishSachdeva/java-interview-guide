/**
 * Java program to print below patterns
 * Pattern 1 - >
           1
           12
           123
           1234
*/

package java_guide.java_guide_02_number_pattern;

public class NumberPattern01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
