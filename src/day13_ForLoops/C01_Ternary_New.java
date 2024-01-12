package day13_ForLoops;

import java.io.Serializable;

public class C01_Ternary_New {
    public static void main(String[] args) {

        // girilen bir pozitif tam sayı
        // eğer çiftse "sayı çift"
        // değilse "sayı tek" yazdıralım.
        // ternary kullanarak yapalım.

        int number = 365;

        if (number % 2 == 0)
            System.out.println("Sayı çift");
        else
            System.out.println("Sayı tek");


        String message = number % 2 == 0 ? "Sayı çift" : "Sayı tek";

        System.out.println("message = " + message);

        System.out.println(number % 2 == 0 ? "Sayı çift" : "Sayı tek");


        //girilen bir sayının mutlak değerini alın ve yazdırın.
        int x = -6;

        if (x >= 0)
            System.out.println(x);
        else {
            // x=x*(-1);
            x = -x;
            // x=Math.abs(x);
            System.out.println(x);
        }

        int y=-9;

        //ternary
        y = y >= 0 ? y : -y;

        System.out.println("y = " + y);

        // BASIT IF YAPILARINI TERNARY ILE YAPILABILIR..

        //ternary op. ya direkt sout içinde kullanılır
        // ya da bir değişkene atama yapılacak şekilde kullanılır.

        int z=20;

         //  z % 2 == 0 ? "z çift" : "z tek";  bu şekilde java bunu bir
        //  statement olarak kabul etmez ve hata verir

        System.out.println(z % 2 == 0 ? "z çift" : "z tek");

        String sonuc =z % 2 == 0 ? "z çift" : "z tek";
        System.out.println("sonuc = " + sonuc);

        //true olduğundaki sonuç ile false olduğundaki sonuç
        // farklı data türünde olursa

        // sayı çift ise "sayı çift" yazdırın, değilse sayının iki katını yazdırın
         int sayi=25;

         //yazdıracaksak sorun çıkmaz..
        System.out.println(sayi % 2 == 0 ? "Sayı çift" : sayi*2);

        //ancak atama işlemi direkt olmaz  (ileri düzeylerde olur.)
        Serializable serializable = sayi % 2 == 0 ? "Sayı çift" : sayi * 2;
        System.out.println("serializable = " + serializable);

        // ya da sayıyı stringe çevirerek kullanırsınız..
        String str =sayi % 2 == 0 ? "Sayı çift" : String.valueOf(sayi * 2);
        System.out.println("str = " + str);

    }
}
