package day21_Class_And_Methods;

import java.util.Scanner;

public class C02_Davetiye {

//Kullanıcıdan
//2 adet kelim e isteyen bir metodunuz olsun Bu metot
//kullanıcıya ileteceğiniz mesajı size belirleme opsiyonu sunsun Eğer
//kullanıcı cümleleri yanlışlıkla aynı girerse Başka bir metot çağrılsın ve
//kullanıcıya kelimeler farklı olmalıydı mesajı ile tekrar ondan 2 kelime
//istesin Kelimeler farklı gelirse bir başka metot çağrılsın ve kelimeleri
//bağlayıp( concat önünü ve arkasını yıldızlarla süsleyip versin

    public static void main(String[] args) {
        davetiye();
    }

    private static void davetiye() {

        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("1. kelime :");
            String kelime1 = scan.nextLine();
            System.out.println("2. kelime :");
            String kelime2 = scan.nextLine();

            if (kelimeKontrol(kelime1, kelime2)) {
                System.out.println("Kelimeler farklı olmalı");
                continue; //davetiye();
            } else {

                davetiyeYazdır(kelime1, kelime2);
                return;
            }
        }

    }

    private static void davetiyeYazdır(String kelime1,String kelime2) {
        System.out.println("********"+kelime1+"*************"+kelime2+"***********");
    }

    private static boolean kelimeKontrol(String kelime1, String kelime2) {
        return kelime1.equals(kelime2);
    }


}
