public class FriendsPairing {
    // public static int friendsPairing(int n) {
    // // base case
    // if (n == 1 || n == 2) {
    // return n;
    // }
    // // choise
    // // single
    // int fnm1 = friendsPairing(n - 1); // fnm1 -> f(n - 1)

    // // pair
    // int fnm2 = friendsPairing(n - 2);
    // int pairWays = (n - 1) * fnm2;

    // // toralWays
    // int totalWays = fnm1 + pairWays;
    // return totalWays;
    // }

    // Less line code for this problem.....
    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(2));
    }
}