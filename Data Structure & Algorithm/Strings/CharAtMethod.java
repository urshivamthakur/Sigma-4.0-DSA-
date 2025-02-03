public class CharAtMethod {

    //To print all the letter of Strings
    public static void printLetters(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {

        // concatination
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + " " + lastName;
        // System.out.println(fullName.charAt(0));
        printLetters(fullName);
    }

}
