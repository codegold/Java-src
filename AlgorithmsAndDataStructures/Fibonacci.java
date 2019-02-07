package AlgorithmsAndDataStructures;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fibNaive(10));
        System.out.println(fibEffective(100));
    }

    //naive, slow, clear
    private static long fibNaive(int n) {
        if (n <= 1)
            return n;

        return fibNaive(n - 1) + fibNaive(n - 2);

    }

    private static long fibEffective(int n) {
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++)
            arr[i] = arr[i - 1] + arr[i - 2];

        return arr[n];


    }
}
