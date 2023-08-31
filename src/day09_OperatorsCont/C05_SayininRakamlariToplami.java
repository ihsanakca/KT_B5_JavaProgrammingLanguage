package day09_OperatorsCont;

import java.util.Scanner;

public class C05_SayininRakamlariToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen 3 basamakli bir sayi giriniz : ");

        int number = scanner.nextInt();  //352
        int lastDigit = number%10;       // lastDigit = 2

        int totalOfDigits = lastDigit;   //totalOfDigits=2

        number=number/10;                //352 --> 35
        lastDigit = number%10;           // lastDigit = 5
        totalOfDigits = totalOfDigits+lastDigit; // 7

        number=number/10;                //35 --> 3
        lastDigit=number%10;              //3

        totalOfDigits= totalOfDigits+lastDigit;

        System.out.println("Girilen sayinin rakamlar toplami : "+totalOfDigits);



    }
}

// Kullanicidan 3 basamakli bir sayi alin
// ve sayinin rakamlari toplamini ekrana yazdirin!
//112   = 1 + 1 + 2 = 4
//952   = 9 + 5 + 2 = 16
