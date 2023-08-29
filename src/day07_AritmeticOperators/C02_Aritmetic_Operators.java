package day07_AritmeticOperators;

public class C02_Aritmetic_Operators {
    public static void main(String[] args) {
/*
 Ali 1990 yılında doğmuştur. Ali kaç yaşındadır?


 Ali ile Ahmet kardeştir. Ali 1990 yılında doğmuştur. Ali ,Ahmet
den 5 yaş büyük olduğuna göre Ahmet kaç yaşındadır.


     int dogumYili=1978;
     int yasAli=2023-dogumYili;
     int yasAhmet=yasAli-5;

        System.out.println("Ali'in yaşı "+yasAli+"'dir.");
        System.out.println("Ahmet'in yaşı "+yasAhmet+"'dir.");

*/

     /*
     2 cm yarıçapına sahip dairenin alanı ve çevresini hesaplayın?
(PI=3.14)

        double r=2;
        double PI=3.14;
        //  çemberin alanı=PI*r*r
        // çemberin çevresi=2*PI*r

        double cevre=2*PI*r;
        double alan=PI*r*r;
        double alan2=Math.PI*r*r;
        double alan3=Math.PI*Math.pow(r,2);
        System.out.println("alan = " + alan);
        System.out.println("alan2 = " + alan2);
        System.out.println("alan3 = " + alan3);

        int max = Math.max(5, 8);
        System.out.println("max = " + max);
 */


/*
        //300 Fahrenheit kaç Celsius ‘dur?
        // (°C=(°F-32)/1.8)

        double f=300;
        double c=(f-32)/1.8;
        System.out.println(f+" fahrenheit "+c+" santigrat derecedir.");


        //32 Celsius kaç Fahrenheit ‘dır? (°C=(°F-32)/1.8)

      double c=32;
      double f=c*1.8+32;
        System.out.println("f = " + f);






        //Ali fizik dersinden 92,
// kimya dersinden 55,
// matematik dersinden 89 almıştır.
//1.Ali’nin not ortalaması kaçtır?

double f=92;
double k=55;
double m=89;
double ort=(f+k+m)/3;
        System.out.println("ort = " + ort);
*/

/*
Toplantı salonunda 15 adet sıra ve her sırada 12 adet koltuk
vardır. Toplantıya 113 katılmıştır.

 */

   int sira=15;
   int katilimciSayisi=113;
   int siraKoltukAdedi=12;

//1.Toplantı salonun toplam kapasitesi nedir?
        int kapasite=sira*siraKoltukAdedi;
        System.out.println("kapasite = " + kapasite);

//2.Kaç adet boş koltuk vardır ?
    int bosKoltuksayisi=kapasite-katilimciSayisi;
        System.out.println("bosKoltuksayisi = " + bosKoltuksayisi);

//3.Kaç adet sırada oturulmaktadır ?
        int oturulanSiraAdedi=katilimciSayisi/siraKoltukAdedi+1;
        System.out.println("oturulanSiraAdedi = " + oturulanSiraAdedi);

//4. Kaç sıra tamamen boş kalmıştır.

     int bosSiraAdedi=sira-oturulanSiraAdedi;
        System.out.println("bosSiraAdedi = " + bosSiraAdedi);

//    5.Oturulan sıralarda kaç adet boş koltuk vardır?

int oturulanSiradakşBosluk=siraKoltukAdedi-(katilimciSayisi%siraKoltukAdedi);
        System.out.println("oturulanSiradakşBosluk = " + oturulanSiradakşBosluk);

    }
}
