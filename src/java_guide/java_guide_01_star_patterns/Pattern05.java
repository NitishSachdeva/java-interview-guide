/**
 * Java program to print below patterns

                                                 ****
                                                  ***
                                                   **
                                                    *

 * */

package java_guide.java_guide_01_star_patterns;

public class Pattern05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}