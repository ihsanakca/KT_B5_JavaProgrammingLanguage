package day09_OperatorsCont;

import java.util.Scanner;

public class C02_BoyKilo {
    public static void main(String[] args) {
        //1. Scanner classindan bir obje olustur
        Scanner scan= new Scanner(System.in);

        System.out.print("Lutfen Boyunuzu Giriniz (m) (Ornek : 1.82) : ");
        double boy = scan.nextDouble();

        System.out.print("Lutfen Kilonuzu Giriniz (kg) (Ornek : 82.5) : ");
        double kilo = scan.nextDouble();
        scan.nextLine();

        System.out.print("Lutfen Isminizi Giriniz : ");
//        String isim = scan.next();
        String isim = scan.nextLine();

        System.out.println(isim+"; Boyunuz : "+boy+" m, Kilonuz : "+kilo+" kg");


    }
}
//Kullanıcıdan boy(ondalıklı) ve kilosunu(ondalıklı) bilgisini alıp ekrana tek satırda yazdırınız
//scanner.next() ilk space/bosluga kadar olan degerleri alir
//scanner.nextLine() ilk Entera kadar olan degerleri alir
