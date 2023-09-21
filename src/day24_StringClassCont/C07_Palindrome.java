package day24_StringClassCont;

public class C07_Palindrome {
    public static void main(String[] args) {


        String word = "eyedipadanadapideye";
        String reversed = "";

        for (int i = word.length()-1;0<=i  ; i--) {
//            reversed = reversed.concat(""+word.charAt(i));
            reversed = reversed.concat(word.substring(i,i+1));
        }

        boolean isPalindrome = reversed.equals(word);

        System.out.println("isPalindrome = " + isPalindrome);

    }
}
