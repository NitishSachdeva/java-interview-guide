/**
 * Reverse a given string, also verify if it's a palindrome
 */
package strings;


public class PalindromeString {
    public static void main(String[] args) {
        String a = "madam";
        String reverse = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            reverse = reverse + a.charAt(i);
        }
        System.out.println("String reversal returned a string -> " + reverse);
        if (a.equals(reverse)) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
    }
}
