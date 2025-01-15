import java.util.*;

public class pq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        int mul = 0;
        for (int i = 1; i <= 100000; i++) {
            mul = n * i;
            System.out.println(n + " X " + i + " = " + mul);
        }
        sc.close();
    }
}