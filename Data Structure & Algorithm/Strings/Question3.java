public class Question3 {

    public static void largestString(String str[]) {

        String largest = str[0];
        for (int i = 0; i < str.length; i++) {
            if (largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }
        }

        System.out.println(largest);
    }

    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "banana" };

        largestString(fruits);
    }
}