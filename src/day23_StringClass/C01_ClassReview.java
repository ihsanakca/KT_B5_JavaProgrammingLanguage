package day23_StringClass;

import day21_Class_And_Methods.Car;

public class C01_ClassReview {
    public static void main(String[] args) {
        Car benimArabam = new Car();
        benimArabam.calistir();
        benimArabam.marka = "Tesla";
        benimArabam.model = "Model Y";
        benimArabam.hız = 250;
        benimArabam.renk ="Kirmizi";
        benimArabam.calistir();



        Car seninAraban = new Car();
        seninAraban.marka = "TOGG";
        seninAraban.model = "t10x";
        seninAraban.renk = "Toros Siyahi";
        seninAraban.hız=210;

        System.out.println("seninAraban.isElectrical = " + seninAraban.isElectrical);


        System.out.println("seninAraban.hız = " + seninAraban.hız);
        System.out.println("seninAraban.renk = " + seninAraban.renk);
        System.out.println("seninAraban.model = " + seninAraban.model);
        System.out.println("seninAraban.marka = " + seninAraban.marka);
        seninAraban.calistir();
        seninAraban.hızlan();
        seninAraban.dur();

        System.out.println("Math.pow(2,3) = " + Math.pow(2, 3));
        System.out.println("Math.PI = " + Math.PI);


// Instance variables has default values, local variable should be initialized
//        String str1 ;
//        System.out.println(str1);
//
//        boolean isMarried;
//        System.out.println(isMarried);


    }
}
