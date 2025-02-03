public class StringFunction {

    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {

        // Compare
        // String a = "Tony";
        // String b = "Tony";
        // // String c = new String("Tony");

        // if (a.equals(b)) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Not equal");
        // }

        // substring....
        String str = "HelloWorld";
        System.out.println(substring(str, 0, 3));
    }
}
