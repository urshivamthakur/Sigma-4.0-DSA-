public class Ternary {
    public static void main(String[] args) {
        int num = 9;

        // ternary Operator
        String type = ((num % 2) == 0) ? "Even" : "Odd";
        System.out.println(type);
    }
}