package day13_ForLoops;

import java.io.Serializable;

public class C01_Ternary_New_2 {
    public static void main(String[] args) {

       /*
       Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        */

        int kenar1=12;
        int kenar2=12;
        int kenar3=12;

        System.out.println(kenar1==kenar2 && kenar1==kenar3 ? "Eskenar ucgen" : "Eskenar degil");

        //kenar uzunluğu pozitif olmalıdır
        System.out.println(kenar1==kenar2 && kenar1==kenar3 && kenar1>0 ? "Eskenar ucgen" : "Eskenar degil");


        /*
        Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
        harf olarak yazdirin, yoksa girilen harfi yazdirin
         */

        char harf='d';

        harf= harf >='a' && harf <= 'z' ? (char) (harf - 32) : harf;

        System.out.println("harf = " + harf);

    }
}
