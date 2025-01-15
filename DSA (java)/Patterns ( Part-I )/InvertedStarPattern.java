public class InvertedStarPattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int star = 1; star <= (n - i + 1); star++) { // n = 4
                System.out.print("*");
            }
            System.out.println();
        }
    }
}