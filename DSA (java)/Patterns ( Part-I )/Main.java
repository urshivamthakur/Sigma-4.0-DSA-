public class Main {
    public static void main(String[] args) {
        int l = 5;
        int n = 3;
        int num = 1;

        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

}
