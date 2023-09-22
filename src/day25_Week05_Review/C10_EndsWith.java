package day25_Week05_Review;

import java.util.Scanner;

public class C10_EndsWith {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a word");

        String str= scanner.nextLine();
        if(str.substring(str.length()-2).equalsIgnoreCase("ly")) //== kullanmıyoruz!!!
        {
            System.out.println("really");
        } else{
            System.out.println("never mind");
        }



    }
}
