import java.util.*;

public class InputScanner {
    public static void main(String[] args) {
        System.out.println("Write Something....  ");
        Scanner sc = new Scanner(System.in);

        // Single word input
        // String input = sc.next();
        // System.out.println("\nYour input is: " + input);

        // Return whole word(Sentence)
        // String input = sc.nextLine();
        // System.out.println("\nYour input is: " + input);

        // Integer Input
        int number = sc.nextInt();
        System.out.println("\nYour input is: " + number);

        sc.close();
    }
}