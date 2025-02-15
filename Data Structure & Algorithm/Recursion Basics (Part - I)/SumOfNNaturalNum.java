public class SumOfNNaturalNum {
    public static int printSumOfNNaturalNum(int n) {
        if (n <= 1) {
            return 1;
        } else {
            int sum = n + printSumOfNNaturalNum(n - 1);
            return sum;
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int result = printSumOfNNaturalNum(n);
        System.out.println("Sum of " + n + " natural numbers is " + result);
    }
}
