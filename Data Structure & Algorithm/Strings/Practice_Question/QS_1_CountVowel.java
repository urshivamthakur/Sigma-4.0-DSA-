import java.util.*;

public class QS_1_CountVowel {
    public static void main(String[] args) {

        // Enter String from user
        System.out.print("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int countVowel = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countVowel++;
            }
        }

        System.out.println(countVowel);

        sc.close();

    }

}