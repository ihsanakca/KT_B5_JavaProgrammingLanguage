package day10_Relational_LogicalOperators_Review;

import java.util.Scanner;

public class C02_PositiveOrNegative {
    public static void main(String[] args) {

//        int a = 10; // assignment operator
//
//        System.out.println(a==20);  // boolean false
//        System.out.println(a!=20);  // boolean true
//        System.out.println(a==10);  // boolean true

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int number = scan.nextInt();

        boolean isPositive = number > 0 ;
        //                 10    true
        boolean isNegative = number < 0 ;
        //                 10   false

        boolean isZero = number == 0;




        System.out.println("isPositive = " + isPositive);
        System.out.println("isNegative = " + isNegative);
        System.out.println("isZero = " + isZero);

    }
}


// Kullanicidan bir integer deger alin
// Sayinin negatif pozitif sifir oldugunu ekrana yazdirsin