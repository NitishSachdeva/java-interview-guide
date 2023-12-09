package java_guide.java_guide_04_strings;

import java.util.ArrayList;

public class UniqueList {
    public static void main(String[] args) {

        String s = "abcdefaaaa";
        char[] chars = s.toCharArray();
        ArrayList<String> uniqueList = new ArrayList<String>();
        for (int i = 0; i < chars.length; i++) {
            if (!uniqueList.contains(String.valueOf(chars[i]))) {
                uniqueList.add(String.valueOf(chars[i]));
            }
        }
        System.out.println(uniqueList);
    }
}
