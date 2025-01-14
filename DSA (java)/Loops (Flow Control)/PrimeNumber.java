import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println(n + "is a Prime Number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {  // (int i = 2; i <= n - 1; i++)
                if (n % i == 0) {
                    isPrime = false; // n is a multiple of i (i not equal to 1 or n)
                }
            }

            if (isPrime == true) {
                System.out.println(n + " is a Prime Number");
            } else {
                System.out.println(n + " is not a Prime Number");
            }
        }

        sc.close();
    }
}