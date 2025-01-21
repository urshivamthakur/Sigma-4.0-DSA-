public class InvertedRotHalfPyramid {
    public static void InvHalf_Pyramind(int n) {
        // Outer loop
        for (int i = 1; i <= n; i++) {
            // This loop will print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Loops for printing stars(*)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InvHalf_Pyramind(5);
    }
}