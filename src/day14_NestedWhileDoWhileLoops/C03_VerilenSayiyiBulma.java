package day14_NestedWhileDoWhileLoops;

import java.util.Random;
import java.util.Scanner;

public class C03_VerilenSayiyiBulma {
    public static void main(String[] args) {
        /*
        0-20 arasında rastgele bir sayı belirleyelim.
        Daha sonra bu sayıyı 5 hak vererek bulmasını isteyelim.
        Bulunca "Tebrikler buldunuz" yazdıralım
        Bulamazsa "Maalesef bulamadınız" yazdıralım
         */
        Random rd =new Random();
        int bulunacakSayi= rd.nextInt(6);  // 0 dan 20 ye kadar sayı rastgele sayı belirler
        int hak=5;
        System.out.println("0-20 arasında bir sayı tuttuk. 5 hakkın var. Bakalım bulabilecek misin?");
        for (int i = 0; i < 5; i++) {
            Scanner scanner =new Scanner(System.in);
            System.out.println("Tahminini gir bakalım :");
            int tahmin = scanner.nextInt();

            if (tahmin==bulunacakSayi){
                System.out.println("Tebrikler buldunuz");
                break;
            }else {
                System.out.println( "Maalesef bulamadınız "+(--hak)+" hakkın kaldı.");
            }
        }
        System.out.println("Tutulan sayi : "+bulunacakSayi);
    }
}
