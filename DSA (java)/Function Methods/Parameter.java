import java.util.*;

public class Parameter {
    public static int calculateSum(int a, int b) { // parameters or fomral parameters
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a : ");
        int a = sc.nextInt();
        System.out.println("Enter number b : ");
        int b = sc.nextInt();
        int sum = calculateSum(a, b); // arguments or actual parameters
        System.out.println("Sum is : " + sum);
        sc.close();
    }

}