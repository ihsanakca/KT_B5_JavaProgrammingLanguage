package day14_NestedWhileDoWhileLoops;

import java.util.Scanner;

public class C08_VerilenSayilariToplama {
    public static void main(String[] args) {
        // girilen sayıları toplayan bir döngü yazınız
        // eğer sıfır girilirse döngüyü bitirsin ve sonucu yazdırsın


        int toplam = 0;
        boolean bl =true;

        while (bl) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Toplanacak sayıyı giriniz.. Çıkmak için 0'a basın");
            int sayi = scanner.nextInt();
            if (sayi != 0){
                toplam += sayi;
                System.out.println("toplam = " + toplam);
            }else {
                bl=false;
            }

        }

        System.out.println("Genel toplam = " + toplam);


    }
}
