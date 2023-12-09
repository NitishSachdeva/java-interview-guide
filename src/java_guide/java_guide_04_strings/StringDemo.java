package java_guide.java_guide_04_strings;

public class StringDemo {

    public static void main(String[] args) {
        String a = "hello";//String literal -Mutable
        String b = "hello";
        String c = a.concat("World");
        System.out.println(a);

        String s = new String("hello");
        String s1 = new String("hello");  //String class creates new object every time in memory

        System.out.println(a.equals(b));//true
        System.out.println(a == b);//true

        System.out.println(a.equalsIgnoreCase(s));//equals operator checks for content  true
        System.out.println(a == s);//fail matching the references ==
        System.out.println(s == s1);//fail references are different as they are defined with string class


        //StringBuffer and StringBuilder -Mutable
        StringBuffer sb = new StringBuffer("hello");
        sb.append("world");
        System.out.println(sb);
        sb.insert(2, "She");//heShelloworld
        System.out.println(sb);
        sb.replace(5, 7, "aa");//heSheaaoworld
        System.out.println(sb);
        sb.deleteCharAt(12);//heSheaaoworl
        System.out.println(sb);
        sb.reverse();//
        System.out.println(sb);
        StringBuilder sbb = new StringBuilder("hello");

        //StringBuilder is not thread safe. It is Non Synchronized, It is faster
    }

}
