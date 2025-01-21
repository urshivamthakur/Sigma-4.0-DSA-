public class ButterflyPattern {
    public static void butterflyPattern(int n) {
        // Upper Half of outer loop
        for (int i = 1; i <= n; i++) {
            // printing i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            // again i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i = n; i >= 1; i--) {
            // Printing i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            // Again i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        butterflyPattern(4);
    }
}
