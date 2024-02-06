package day32_Arrays_02;

import java.util.Arrays;

public class C05_ARRAY_EXAMPLE {
    public static void main(String[] args) {

        int [] sayilar = {1,2,3,4,5,6,7,8};
        int[] ints = sagaKaydir(sayilar, 2);
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));
        int[] ints1 = kayanSayilar(sayilar, 6);
        System.out.println("Arrays.toString(ints1) = " + Arrays.toString(ints1));
    }
    /*
    kayan sayılar interview sorusu: Girilen sayılar kayma miktarına göre sağa kaydırılması
    gerekmektedir. Fakat sağa doğru kayan sayılar soldan tekrar giriş yapabilmeli.
    metod(sayilar,kaymaMiktari)
    0,1,2,3,4,5 girildi kayma miktarı 2 ise 4, 5, 0, 1, 2, 3
    0,1,2,3,4,5 girildi kayma miktarı 4 ise 2, 3, 4, 5, 0, 1
     */

    public static int [] kayanSayilar (int [] sayilar , int kaymaMiktari){
        int [] result = new int[sayilar.length];
        int uzunluk = sayilar.length;

        for (int i = 0; i < sayilar.length; i++) {
            result[(i+kaymaMiktari) % uzunluk]=sayilar[i];
        }

        return result;

    }

    static int[] sagaKaydir(int[] dizi, int kaymaMiktari) {
        int boyut = dizi.length;
        kaymaMiktari = kaymaMiktari % boyut; // Kayma miktarını dizinin boyutuna mod alarak sınırla

        if (kaymaMiktari == 0) {
            // Kayma miktarı sıfır ise işlem yapma, çünkü kayma miktarı kadar sağa kaydırmak anlamsız olacaktır.
            return dizi;
        }

        // Geçici bir dizi oluştur
        int[] gecici = new int[boyut];

        // Diziyi kayma miktarı kadar sağa kaydır
        for (int i = 0; i < boyut; i++) {
            gecici[(i + kaymaMiktari) % boyut] = dizi[i];
        }

        // Geçici diziyi geri döndür
        return gecici;
    }

}
