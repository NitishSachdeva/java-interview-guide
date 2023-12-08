/**
 * For a given strings
 * s1 ="Abcdef" , remove the vowels with '*'
 * s2="Abcdef" , remove the consonants with '*'
 */
package strings;

import java.util.Locale;

public class String_Vowels_Consonants_Removal {
    public static void main(String[] args) {
        String s1 = "Abcdef";
        String s2 = "Abcdef";

        String A1 = " ";
        String A2 = " ";
        int i;

        A1 = s1.replaceAll("[aeiouAEIOU]", "*");
        System.out.println("using string literals method -> " + A1);

        A2 = s2.replaceAll("[bcdifghjklmnpqrstvwxyz]", "#");
        System.out.println("using string literals method -> " + A2);


        //If you only wants to print consonants from a given string
        String s3 = "Given a statement";
        s3 = s3.toLowerCase();
        for (i = 0; i < s3.length(); i++) {
            if (s3.charAt(i) != 'a' && s3.charAt(i) != 'e' && s3.charAt(i) != 'i' && s3.charAt(i) != 'o' && s3.charAt(i) != 'u') {
                System.out.print(s3.charAt(i));
            }
        }


        System.out.println(" ---------------------------- ");

        String A3 = " ";
        String A4 = " ";

        char[] str1 = s1.toLowerCase().toCharArray();
        char[] str2 = s2.toLowerCase().toCharArray();

        //Remove vowels with '*'
        for (i = 0; i < str1.length; i++) {
            if (str1[i] == 'a' || str1[i] == 'e' || str1[i] == 'i' || str1[i] == 'o' || str1[i] == 'u') {
                A3 = s1.replace(str1[i], '*');
            }
        }
        System.out.println("String after vowels removal - > " + A3);

        // remove consonants with '#'
        for (i = 0; i < str2.length; i++) {
            if (str2[i] == 'a' || str2[i] == 'e' || str2[i] == 'i' || str2[i] == 'o' || str2[i] == 'u') {
                continue;
            } else
                A4 = s2.replace(str2[i], '#');
        }
        System.out.println("Strings after consonants removal -> " + A4);
    }
}
