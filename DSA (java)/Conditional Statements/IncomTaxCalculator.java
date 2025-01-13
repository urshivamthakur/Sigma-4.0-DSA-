import java.util.*;

public class IncomTaxCalculator {
    public static void main(String[] args) {
        System.out.println("Enter total Income: ");
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();

        if (income < 500000) {
            System.out.println("0% tax");
        } else if ((income >= 500000) && (income <= 1000000)) {
            System.out.println("20% tax");
        } else if (income > 1000000) {
            System.out.println("30% tax");
        } else {
            System.out.println("No Tax");
        }

        sc.close();

    }

}