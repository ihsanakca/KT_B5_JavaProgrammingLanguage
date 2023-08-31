package day09_OperatorsCont;

import java.util.Scanner;

public class C03_BodyMassIndex {
    public static void main(String[] args) {
        //1. Scanner classindan bir obje olustur
        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen Boyunuzu Giriniz (m) (Ornek : 1.82) : ");
        double boy = scan.nextDouble();

        System.out.print("Lutfen Kilonuzu Giriniz (kg) (Ornek : 82.5) : ");
        double kilo = scan.nextDouble();

        double bmi = kilo / (boy * boy);

        System.out.println("Kilonuz : " + kilo);
        System.out.println("Boyunuz : " + boy);
        System.out.println("Beden Kitle Endeksiniz : " + bmi);


    }


}

/*
 * Kullanicidan aldigimiz boy ve kiloda Beden Kitle Endeksi body mass index hesaplanacak
 *   Body Mass Index (bmi) = kilo / (Boy(m)*Boy(m))
 *
 * */