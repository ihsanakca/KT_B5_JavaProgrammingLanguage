package day34_Arrays_04;

import java.util.Arrays;

public class C02_Anagram {
    public static void main(String[] args) {
        System.out.println("isAnagram(\"kil\",\"ilk\") = " + isAnagram("kil", "ilk"));
        System.out.println("isAnagram(\"adam\",\"madam\") = " + isAnagram("adam", "madam"));
        System.out.println("isAnagram(\"adam\",\"dama\") = " + isAnagram("adam", "dama"));

    }


    public static boolean isAnagram(String str1, String str2){
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
//        System.out.println(charArray1);
//        System.out.println(charArray2);
//        System.out.println(Arrays.equals(charArray1, charArray2));

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

//        System.out.println(charArray1);
//        System.out.println(charArray2);


        return Arrays.equals(charArray1,charArray2);
    }
}

// write a method that can check if str1 & str2 are build out same characters ANAGRAM
//kil  ilk    -> ikl ikl
//adam dama   -> aadm  aadm