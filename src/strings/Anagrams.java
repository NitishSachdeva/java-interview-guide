package strings;

import java.util.Arrays;

public class Anagrams {
    static void checkAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] arrS1 = s1.toLowerCase().toCharArray();

            char[] arrS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(arrS1);
            Arrays.sort(arrS2);

            status = Arrays.equals(arrS1, arrS2);
        }
        if (status)
            System.out.println(s1 + " " + s2 + " " + "are anagrams");
        else
            System.out.println(s1 + " " + s2 + "are not anagrams");
    }

    public static void main(String[] args) {
        checkAnagram("keep", "peek");
    }
}

