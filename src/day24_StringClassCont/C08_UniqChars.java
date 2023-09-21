package day24_StringClassCont;

public class C08_UniqChars {
    public static void main(String[] args) {
        String str = "AABC!! ??1233";
        String result =""; //BE

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i); // A A B
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                result +=ch;
            }
        }
        System.out.println("result = " + result);
    }
}
/*Write a program that can return the unique characters from a String

        Ex:
        input:AABCCDDDE
        output:BE

        input:AA 1212BC
        output: BC

        input:AABC!! ??1233
        output:


        Hint: You will need indexOf() and lastIndexOf()
        if the first and last index numbers of the character are same, then it's unique
        */