public class DiagonalSum {

    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j) {
        // sum += matrix[i][j];
        // } else if (i + j == n - 1) {
        // sum += matrix[i][j];
        // }
        // }
        // }

        for (int i = 0; i < n; i++) {
            // primary diagonal
            sum += matrix[i][i];

            // secondary diagonal
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int sum = diagonalSum(matrix);
        System.out.println("Diagonal Sum: " + sum);
    }
}