package day08_ScannerAndOperators;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //1. Scanner objesi olustur
        Scanner scan = new Scanner(System.in);

        //2. Kullaniciyi bilgilendir! Ne istedigimizi soyle!
        System.out.println("Lutfen isminizi giriniz:");

        //3. Girilen veriyi icine koyabilecegimiz uygun bir degisken olustur
        // scanner uygun methodu ile veriyi degisken icerisine yaz

        String name= scan.nextLine();
        // scan.next()  ==> ilk bosluga kadar alir
        // scan.nextline() ==> ilk entera kadar kismi alir

        System.out.println("Isminiz : " +name);

        //4. close scanner

        scan.close();




    }
}
