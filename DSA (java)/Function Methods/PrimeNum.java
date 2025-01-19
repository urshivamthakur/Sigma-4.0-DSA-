public class PrimeNum {
    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false; // 1 or less than 1 is not a prime numbor nor a composite number.......
        }

        if (n == 2) {
            return true;
        }

        // for (int i = 2; i <= (n - 1); i++) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }
}