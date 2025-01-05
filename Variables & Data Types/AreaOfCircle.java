import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius r : ");
        int r = sc.nextInt();
        float pi = 3.14f;
        float area = pi * r * r;

        System.out.println("Area of a Circle is : " + area);

        sc.close();
    }
}