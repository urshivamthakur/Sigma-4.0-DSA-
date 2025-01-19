public class BinomialCofficient {
    public static int calBinomialCofficient(int n, int r) {
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nmrfact = factorial(n - r);
        int ncr = nfact / (rfact * nmrfact);
        return ncr;

    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int BinCoff = calBinomialCofficient(n, r);
        System.out.println("Binomial Cofficient = " + BinCoff);
    }
}