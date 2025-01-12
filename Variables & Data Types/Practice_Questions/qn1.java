package Practice_Questions;

// Average of three number
import java.util.*;

public class qn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers A, B and C");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float average = (a + b + c) / 3;

        System.out.println("Average = " + average);

        sc.close();
    }
}