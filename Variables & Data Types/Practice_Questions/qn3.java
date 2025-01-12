package Practice_Questions;

// Cost of three item using float
import java.util.*;

public class qn3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total_cost = pencil + pen + eraser;

        System.out.println("Total Cost : " + total_cost);

        float gst = (total_cost * 18) / 100;
        System.out.println("18% GST : " + gst);
        float total_Amount = gst + total_cost;
        System.out.println("Total Bill = " + total_Amount);

        sc.close();
    }
}