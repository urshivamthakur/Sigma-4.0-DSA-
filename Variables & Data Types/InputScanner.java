import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        int a = sc.nextInt();
        System.out.println("Enter the number b: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum of a & b : " + sum);

        sc.close();
    }
}