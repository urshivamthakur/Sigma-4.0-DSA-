package Practice_Question;

public class pq1 {
    public static int avg(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 5;
        System.out.println(avg(a, b, c));
    }
}