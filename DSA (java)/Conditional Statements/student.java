import java.util.*;

public class student {
    public static void main(String[] args) {
        System.out.print("Enter your mark: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        String result = (marks >= 33) ? "PASS" : "FAIL";
        System.out.println(result);

        sc.close();
    }
}