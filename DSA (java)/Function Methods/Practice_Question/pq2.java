package Practice_Question;

// import java.util.*;

public class pq2 {
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        if (isEven(10)) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is odd");
        }
    }
}