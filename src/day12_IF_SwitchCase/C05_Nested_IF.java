package day12_IF_SwitchCase;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C05_Nested_IF {
    public static void main(String[] args) {
        // Bir havuz girişte kullanıcıya 18 yaşında olup olmadığını
        //sorun 18 yaşın altında ise giremezsiniz şeklinde ikaz verip
        // 18 ve üzerinde ise yanında bayan olup olmadığını sorun
        // bayan yok ise giremesin
        //bayan var ise yüzme bilip bilmediğiniz sorun
        //yüzme bilmiyor ise yine giriş yapamasın

        Scanner scan = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz : ");
        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("Yanınızda bayan var mı? Evet/Hayır");
            String cevap = scan.next();
            if (cevap.equalsIgnoreCase("Evet")) {
                System.out.println("Yüzme biliyormusunuz?Evet/Hayır");
                String cevap2 = scan.next();
                if (cevap2.equalsIgnoreCase("Evet")) {
                    System.out.println("Hoş geldiniz");
                } else {
                    System.out.println("Yüzme bilmeyenler giriş yapamaz");
                }
            } else {
                System.out.println("yanınızda bayan olmadığı için giremezsiniz");
            }
        } else {
            System.out.println("Giremezsiniz");
        }

          /*
        Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin

        hatalı girişlerde kullanıcıyı uyarın...
         */

        // yaş ve cinsiyet
        //birden fazla değişkene sahip if else statement'larını yazarken
        // önce değişkenlerden birine göre ana yapıyı oluşturalım.

        // bu soruda cinsiyeti ana değişken kabul edelim

        //ikinci değişkeni ana değişkenin her bölümünde ayrı ayrı değerlendirelim.

        int yas = 36;
        char cinsiyet = 'K';

        if (cinsiyet == 'K' || cinsiyet == 'k') {
            if (yas < 16 || yas > 80) {
                System.out.println("Geçersiz yaş girişi. Lütfen tekrar giriniz.");
            } else if (yas < 60) {
                System.out.println("Emekli olmak icin daha " + (60 - yas) + " yıl daha çalışmalısınız.");
            } else {
                System.out.println("Emekli olabilirsiniz.");
            }

        } else if (cinsiyet == 'E' || cinsiyet == 'e') {
            if (yas < 16 || yas > 80) {
                System.out.println("Geçersiz yaş girişi. Lütfen tekrar giriniz.");
            } else if (yas < 65) {
                System.out.println("Emekli olmak icin daha " + (65 - yas) + " yıl daha çalışmalısınız.");
            } else {
                System.out.println("Emekli olabilirsiniz.");
            }

        } else {

            System.out.println("Gecersiz cinsiyet girişi. Lütfen tekrar giriniz.");
        }


    }
}
