package day58_JavaReview;

import java.util.Scanner;

public class C04_ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tersini yazdirmak istediginiz kelimeyi giriniz: ");
        String word = scanner.nextLine(); //still using string and immutable

        System.out.println("reverseString(word) = " + reverseString(word));
        System.out.println("reverseString1(word) = " + reverseString1(word));
        System.out.println("reverseString2(word) = " + reverseString2(word));
        System.out.println("reverseString3(word) = " + reverseString3(word));
        System.out.println("reverseString4(word) = " + reverseString4(word));


    }


    public static String reverseString(String str){
        String reversed="";
        for (int i = str.length()-1; 0<=i ; i--) {
            reversed+=str.charAt(i);
        }
        return  reversed;
    }
    public static String reverseString1(String str){
        String reversed="";
        for (int i = str.length()-1; 0<=i ; i--) {
            reversed+=str.substring(i,i+1);
        }
        return  reversed;
    }

    public static String reverseString2(String str){ //kitap ==> kita
        String reversed="";
        while (str.length()!=0){
            reversed+=str.charAt(str.length()-1);
            str=str.substring(0,str.length()-1);
        }
        return  reversed;
    }

    public static String reverseString3(String str){
//        String reversed="";
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();

    }
    public static String reverseString4(String str){
        StringBuffer stringBuffer = new StringBuffer(str);
        return stringBuffer.reverse().toString();

    }

}


/* Kullanicidan bir String isteyin stringi tersten yazdirin*/