package day25_Week05_Review;

import java.util.Scanner;

public class C02_Chars {

    //kavak str.length()=5 -1=4

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir kelime giriniz");

        String str = input.nextLine();

        char firstChar = str.charAt(0);

        char lastChar= str.charAt(str.length()-1);

        if(firstChar==lastChar){
            System.out.println("aynı");
        } else{
            System.out.println("aynı değil");
        }



    }
}
