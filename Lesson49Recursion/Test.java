package Lesson49Recursion;

public class Test {
    public static void main(String[] args) {
        counter(3);
    }

    private static void counter(int n) {
        System.out.println(n);

        counter(n - 1);
    }
}
