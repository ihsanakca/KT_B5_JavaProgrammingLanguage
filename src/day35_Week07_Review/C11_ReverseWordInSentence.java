package day35_Week07_Review;

import java.util.Arrays;

public class C11_ReverseWordInSentence {

    public static void main(String[] args) {

        String str= "I love you";

        String[] s = str.split(" ");

        System.out.println("Arrays.toString(s) = " + Arrays.toString(s));

//        char[] charArray = s[1].toCharArray();
//
//        System.out.println("Arrays.toString(charArray) = " + Arrays.toString(charArray));


        // s[1] -->love

        String reverseLove="";

        for (int i=s[1].length()-1; i>=0; i--){
            reverseLove += s[1].charAt(i);
        }

        System.out.println("reverseLove = " + reverseLove);

        String newSentence = str.replace(s[1], reverseLove);

        System.out.println(newSentence);


    }
}
