package Practice_Questions;

// Area of the Squeare.....
import java.util.*;

public class qn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side: ");

        int side = sc.nextInt();
        int area = side * side;
        System.out.println("area of square is " + area);
        sc.close();
    }
}
