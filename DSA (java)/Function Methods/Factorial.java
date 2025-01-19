public class Factorial {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = 5;
        int fac = factorial(num);
        System.out.print("Factorial of " + num + " is = " + fac);
    }
}