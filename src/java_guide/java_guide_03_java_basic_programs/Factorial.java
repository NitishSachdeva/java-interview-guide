package java_guide.java_guide_03_java_basic_programs;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
