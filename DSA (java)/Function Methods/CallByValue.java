public class CallByValue {
    public static int calSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void swap(int a, int b) {
        // swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        // Swap - values exchagne
        int a = 5;
        int b = 10;
        swap(a, b);
    }
}