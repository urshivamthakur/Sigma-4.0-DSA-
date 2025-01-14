
// Print sum of first n natural numbers.......
import java.util.*;

public class SumOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while (i <= n) {
            sum += i; // sum = sum + i;
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
}
