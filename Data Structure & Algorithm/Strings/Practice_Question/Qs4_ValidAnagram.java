
public class Qs4_ValidAnagram {

    // Code - 1

    // Time Complexity :- o(nlog(n))
    // Space Complexity :- o(n) + o(n) = 2*o(N)
    // public static boolean isAnagram(String s, String t) {
    // if (s.length() != t.length())
    // return false;

    // char[] arr1 = s.toCharArray();
    // char[] arr2 = t.toCharArray();

    // Arrays.sort(arr1);
    // Arrays.sort(arr2);

    // return Arrays.equals(arr1, arr2);

    // }

    // Code - 2

    public static boolean isAnagram(String s, String t) {
        int count[] = new int[26];
        int n1 = s.length();
        int n2 = t.length();

        if (n1 != n2)
            return false;

        for (int i = 0; i < n1; i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        boolean anagram = isAnagram(s, t);
        System.out.println(anagram);

    }
}

/*
 * First time tried by me for this question (Most first approach)
 * 
 * public static String isSort(String str) {
 * // Convert string to character array
 * char charArray[] = str.toCharArray();
 * 
 * // Sort the character array
 * Arrays.sort(charArray);
 * 
 * // Convert sorted character array back to string
 * String sortedArray = new String(charArray);
 * 
 * return sortedArray;
 * }
 * 
 * public static boolean isAnagram(String str1, String str2) {
 * 
 * if (str1.length() != str2.length())
 * return false;
 * 
 * return isSort(str1).equals(isSort(str2));
 * }
 */