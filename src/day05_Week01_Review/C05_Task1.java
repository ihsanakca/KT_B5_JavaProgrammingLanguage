package day05_Week01_Review;

public class C05_Task1{
    public static void main(String[] args){
        //eşit kenar üçgenin bir kenarı 5 cm ise
        //çevresi kaç cm dir
        // ekrana üçgenin çevresi ... cmdir yazınız


        int kenar=5;
        int kenarSayisi=3;
        int cevre=kenar*kenarSayisi;

        System.out.println("Üçgenin çevresi "+cevre+" cm dir.");


//ogrencinin adı Harun, öğretmenin adı ise Leyla dır,
        // bu isimleri bir değişkene atayarak değişkeni
        // Leyla Öğretmen Harun'a "Aferin" dedi.

        String ogrenci="Harun";
        String ogretmen="Leyla";
        System.out.println(ogretmen+" Öğretmen "+ogrenci+"'a \"Aferin\" dedi.");

          /*
        Emel 8 yaşında, Fatih Emelden 7 yaş büyüktür.
        Salih Fatihden 5 yaş küçük ise salihin yaşı kaçtır.
         */

        int emel=8;
        int fatih=emel+7;
        int salih=fatih-5;
        System.out.println("Salih'in yaşı "+salih+" dir");


    }
}
