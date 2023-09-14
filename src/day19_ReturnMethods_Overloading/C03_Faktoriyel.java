package day19_ReturnMethods_Overloading;

public class C03_Faktoriyel {

    public static void main(String[] args) {
        System.out.println("5! = " + faktoriyel(5));
        System.out.println("0! = " + faktoriyel(0));


    }

    /**
     * This method returns the faktorial value of a given number
     * @param sayi
     * @return
     */
    public static double faktoriyel(int sayi){
        double faktoriyel=1;
        for (int i = 1; i <=sayi ; i++) {
              faktoriyel *=i;
        }
        return faktoriyel;
    }
}
// verdigimiz bir sayinin faktoryelini hesaplayip
// sonucu bize donduren bir method olusturun
// 0! = 1
//4!= 4*3*2*1=24
//5!= 5*4!= 120
    /* Method olusturma asamalari
    1.public static (standart)
    2.olusturacagimiz metod bize bir sonuc dondurecekse data tipini belirtmek gerekiyor
    3.metod adi
    4.metodun parantezi() parametre olup olmayacagi ve parametre data tipleri ve isimleri parantez icerisine yazilir
    5 {} bodu ac, dondurulmesi islemi yap,
    6.return keywordu ile dondurulmesi planlanan degeri dondur
     */