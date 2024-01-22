package day16_PRACTICE;

import java.util.Scanner;

public class C06_BasamakDegeriDoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Basamakları toplanacak sayıyı giriniz?");
        int girilenSayi = scanner.nextInt();

        int sonuc=0;

        do {
            sonuc+=girilenSayi%10;
            girilenSayi/=10;
        }while (girilenSayi>0);

        System.out.println("Basamak değeri : "+sonuc);
    }
}
