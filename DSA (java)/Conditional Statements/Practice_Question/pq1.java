package Practice_Question;

import java.util.*;

public class pq1 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        sc.close();
    }
}