public class FunOverloading {
    // function to calculate 2 nums
    public static int sum(int a, int b) {
        return a + b;
    }

    // function to calculate 3 nums
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(5, 2, 1));
    }
}