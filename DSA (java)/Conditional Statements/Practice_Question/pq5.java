package Practice_Question;

import java.util.*;

public class pq5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year (e.g., 2003): ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is leap a Year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        sc.close();
    }
}