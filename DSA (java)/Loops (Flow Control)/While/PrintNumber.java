//Print nubers from 1 to 10...........
// public class PrintNumber {
//     public static void main(String[] args) {
//         int count = 1;
//         while (count <= 10) {
//             System.out.println(count);
//             count++;
//         }
//     }
// }

//print number from 1 to n...........
import java.util.*;

public class PrintNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n: ");

        int count = 1;
        int n = sc.nextInt();
        while (count <= n) {
            System.out.print(count + " ");
            count++;
        }

        sc.close();
    }
}
