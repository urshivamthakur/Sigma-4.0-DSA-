public class Factorial {
    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int result = fact(n);
        System.out.println("Factorial of " + n + " is : " + result);
    }
}