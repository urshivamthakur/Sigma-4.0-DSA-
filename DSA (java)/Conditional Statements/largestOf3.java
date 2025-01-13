public class largestOf3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 6;

        if ((a >= b) && (a >= c)) {
            System.out.println("A, is largest");
        } else if ((b >= a) && (b >= c)) {
            System.out.println("B, is largest");
        } else {
            System.out.println("C, is largest");
        }
    }
}