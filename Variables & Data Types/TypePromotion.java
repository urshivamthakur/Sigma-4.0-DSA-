public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        byte b = 'c';
        System.out.println((int) (b));
        System.out.println((int) (a));
        System.out.println(b - a);
    }
}