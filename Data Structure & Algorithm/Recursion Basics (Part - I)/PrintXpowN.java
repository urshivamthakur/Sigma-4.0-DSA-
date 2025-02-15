public class PrintXpowN {

    // Time Complexity :- O(n)
    // public static int calPow(int x, int n) {
    // if (n == 0) {
    // return 1;
    // }
    // int pow = x * (calPow(x, n - 1));
    // return pow;
    // }

    // Time Complexity :- O(logn)
    public static int optimizedPower(int a, int n) {
        // Base Case
        if (n == 0) {
            return 1;
        }

        // Recursive Call
        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd......
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        // System.out.println(calPow(2, 3));
        System.out.println(optimizedPower(5, 3));
    }
}
