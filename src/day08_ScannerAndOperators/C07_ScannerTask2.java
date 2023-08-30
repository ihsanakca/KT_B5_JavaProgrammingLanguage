package day08_ScannerAndOperators;

import java.util.Scanner;

public class C07_ScannerTask2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz:");  //prompt message

        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz:");

        String soyad = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz:");

        int yas = scanner.nextInt();  //32+Enter
        scanner.nextLine();  // Enter icin koyuldu

        System.out.println("Lutfen dogum yerinizi giriniz:");

        String dogumYeri = scanner.nextLine(); //Enter

        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz : " + soyad);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Dogum Yeriniz : " + dogumYeri);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");


    }
}
//      Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
//		Isminiz : Himmet
//		Soyisminiz : Abi
//		Yasiniz : 38
//      Dogum Yeriniz : Kayseri
//		Kaydiniz basariyla tamamlanmistir.