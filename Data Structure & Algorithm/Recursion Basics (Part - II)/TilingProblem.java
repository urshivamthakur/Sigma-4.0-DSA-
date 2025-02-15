public class TilingProblem {

    // public static int tilingProblem(int n) { // 2 x n (floor size)

    // // base case......
    // if (n == 0 || n == 1) {
    // return 1;
    // }

    // // kaam......
    // // vertical choise
    // int fnm1 = tilingProblem(n - 1); // fnm1 -> f(n-1)

    // // horizontal choise
    // int fnm2 = tilingProblem(n - 2);

    // int totalWays = fnm1 + fnm2;
    // return totalWays;

    // }

    // Less line code for the problem......
    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return tilingProblem(n - 1) + tilingProblem(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(10));
    }
}