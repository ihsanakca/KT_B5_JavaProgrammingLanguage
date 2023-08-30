package day08_ScannerAndOperators;

import java.util.Scanner;

public class C06_ScannerTask1 {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alin
        //Sayiya iki topla karesini al

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int girilenSayi = input.nextInt(); // Java da Scanner classinda nextInt() nettDouble() kullandiktan sonra etc ,
        input.nextLine();                  // nextline() kullaniyorsan fazladan bir tane daha nextline() kullanman gerek

        System.out.println("Lutfen isminizi de giriniz");
        String isim = input.nextLine();

        System.out.println(isim+", Girdigin Sayi : "+girilenSayi);
//        int sonuc;
//        sonuc= (girilenSayi+2)*(girilenSayi+2);
        System.out.println(isim+", Girdigin sayinin iki fazlasinin karesi : "+(girilenSayi+2)*(girilenSayi+2));

        input.close();



    }
}
