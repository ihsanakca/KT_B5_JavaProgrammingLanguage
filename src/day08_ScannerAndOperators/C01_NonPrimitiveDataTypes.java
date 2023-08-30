package day08_ScannerAndOperators;

import java.util.Locale;

public class C01_NonPrimitiveDataTypes {

    public static void main(String[] args) {

        String firstname = "Ahmet";
        String lastname = "Suat";

        firstname = "Mehmet";

        int num1 = 10;

        // primitive data tipleri sadece data tasiyor
        // nonprimitive data tipleri hem deger tasiyor  hem de methodlari var

        System.out.println(firstname);
        System.out.println(firstname.toUpperCase());

        String text = "Buyuk harfe"+" Ingilizce'de "+ "Capital Letter"+" denir.";
        System.out.println(text);

        String not = "not";
        String Not = "Variable isimlendirmelerinde buyuk harfle baslamak yavsiye edilmez ama java bunu kabul eder";
        String nOt = "Bir kere tanimlanan bir degisken tekrar tanimlanamaz";
        String nOT = "isimler farkli olurssa java bunu kabul eder";



    }
}

        //name convention : degisken isimleri kucuk harfle baslar, sonraki kelimeler bitisik ve Buyuk harfle baslar
        //                  camelCase
        //fullName, lastName, sinifNumarasi,
        //Classlarda CamelCase Class isimleri buyuk harfle baslar
        //NonPrimitiveDataTypes.class

