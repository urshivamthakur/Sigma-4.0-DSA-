public class FibonacciNum {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // fib (n - 1)
        int fib1 = fib(n - 1);
        // fib (n - 2)
        int fib2 = fib(n - 2);
        // fib n
        int fibn = fib1 + fib2;
        return fibn;
    }

    public static void main(String[] args) {
        int n = 26;
        int result = fib(n);
        System.out.println(result);
    }
}