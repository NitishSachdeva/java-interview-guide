/**
 * Reverse a given number, also verify if it's a palindrome or not
 */
package java_basic_programs;

public class ReverseNumber {
    public static void main(String[] args) {
        int a = 121;
        int temp = a;
        int reverse = 0;
        int remainder;

        while (temp != 0) {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }
        System.out.println("Number reversal returned a number -> " + reverse);
        if (a == reverse) {
            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }
    }
}
