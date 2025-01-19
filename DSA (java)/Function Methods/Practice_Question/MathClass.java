package Practice_Question;

public class MathClass {
    public static void main(String[] args) {
        int x = 4;
        int y = 2;
        double a = -3.14;

        System.out.println("Minimum number of x and y is : " + Math.min(x, y));
        System.out.println("Maximum no of x and y is : " + Math.max(x, y));
        System.out.println("Square root of x is : " + Math.sqrt(x));
        System.out.println("x power y is : " + Math.pow(x, y));
        // System.out.println("Average of x and y is : " + Math.avg(x, y)); // it is not
        // exist in java
        System.out.println(Math.abs(a));

    }
}