package day27_QuizSolutions;

import java.util.Scanner;

public class C07_CodingAns2 {
    public static void main(String[] args) {
        //vucutKitleEndeksiHesapla(91,186);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu kg (or:85) olarak giriniz : ");
        int weight = scanner.nextInt();
        System.out.println("Lutfen boyunuzu cm (or:175) olarak giriniz : ");
        int tall = scanner.nextInt();

        vucutKitleEndeksiHesapla(weight,tall);



    }


    public static void vucutKitleEndeksiHesapla(int kilo, int boy){

        double vucutKitleEndeksi =0;
        vucutKitleEndeksi= (kilo*10000 / (boy *boy));
        System.out.println("vucutKitleEndeksi = " + vucutKitleEndeksi);
        if(vucutKitleEndeksi>=30) System.out.println("obez");
        else if (25<=vucutKitleEndeksi && vucutKitleEndeksi<30) System.out.println("kilolu");
        else if (20<=vucutKitleEndeksi && vucutKitleEndeksi<25) System.out.println("normal");
        else System.out.println("zayif");


    }
}

// Kullanicinin kilo(kg) ve boyunu(cm) isteyip
//Aldiginiz degerleri bir metoda gondererek hesaplatin
//vucutKitleEndeksiHesapla(kilo,boy)
//vucut kitle endeksi = (kilo*10000 / (boy *boy))
//vucut kitle endeksi
//30’dan buyukse obez,
//25-30 arasi ise kilolu,
//20-25 arasi ise normal,
//20’den kucukse zayif yazdirin.