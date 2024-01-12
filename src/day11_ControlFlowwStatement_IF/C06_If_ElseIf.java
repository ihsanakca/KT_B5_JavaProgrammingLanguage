package day11_ControlFlowwStatement_IF;

public class C06_If_ElseIf {
    public static void main(String[] args) {
        /*
        A ve B iki adet int sayıyı karşılaştırın
        A büyüktür B den
        B büyüktür A dan
        A ve B eşittir
         */
/*
        int a=20;
        int b=20;

        if (a>b){
            System.out.println("a büyüktür b");
        } else if (a==b) {
            System.out.println("a b ye eşittir");
        }else {
            System.out.println("b büyüktür a");
        }
        System.out.println("program bitti");


*/


        /*
        bir program yazın eğer x in değeri 10 ise y ye 20 atansın
        x in değeri 20 ise y ye 30 atansın
        x in değeri 30 ise y ye 40 atansın
        değil ise y ye 0 atansın


        int x=3, y;

        if (x==10){
            y=20;
        } else if (x==20) {
            y=30;
        } else if (x==30) {
            y=40;
        }else {
            y=0;
        }

        System.out.println("y = " + y);
 */







        /*
         //Bir program yazın 2 tane numara kabul etsin ve büyük olanı versin.
         */

        int x=70;
        int y=60;
        if(x>y){
            System.out.println("x = " + x);
        } else if (x==y) {
            System.out.println("sayılar eşittir");
        }else{
            System.out.println(y);
        }

       /* Kullanicidan artik yil olup olmadigini kontrol
        etmek icin yil girmesini isteyin.
                Kural 1: 4 ile bolunemeyen yillar artik yil
                degildir
                Kural 2: 4 ile bolunup 100 ile bolunemeyen
                yillar artik yildir
                Kural 3: 4’un kati olmasina ragmen 100 ile
                bolunebilen yillardan sadece
                400’un kati olan yillar artik yildir
        */

        int year=1800;

        if (year % 4 !=0){
            System.out.println("Artık yıl değildir.");
        } else if (year % 100 !=0) {
            System.out.println("Artık yıldır.");
        } else if (year % 400 ==0) {
            System.out.println("Artık yıldır.");
        } else {
            System.out.println("Artık yıl değildir.");
        }




        int yil=1800;

        if (yil % 4 !=0){
            System.out.println("Artık yıl değildir.");
        } else if (yil % 100 !=0) {
            System.out.println("Artık yıldır.");
        } else if (yil % 400 !=0) {
            System.out.println("Artık yıl değildir.");
        } else if (yil % 4000 ==0) {
            System.out.println("Artık yıl değildir");
        } else {
            System.out.println("Artık yıldır.");
        }


    }
}
