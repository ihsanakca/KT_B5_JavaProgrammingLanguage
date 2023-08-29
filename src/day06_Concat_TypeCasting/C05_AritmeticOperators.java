package day06_Concat_TypeCasting;

public class C05_AritmeticOperators {

    public static void main(String[] args) {
        /*
        İŞLEM ÖNCELİĞİ

        1. () içindeki işlem
        2. * ve / işleminde
        3. - ve + işlemi
         */

        int x=5;
        int y=2;
       // int z=x+y;    // 27
        int z=x-y;  // 3

    //    System.out.println("merhaba"+x-y);  çıkarma olmaz stringde
        System.out.println("merhaba"+x*y); // işlem önceliği çarpmada olduğu için olur

        double d=x/(double) y;
        System.out.println(d);

        double sayi=3+5/2;
        System.out.println(sayi);


        double num1=3+(double)5/2*4%(12-9);
//                3+5/2*4%3
        //         3+2.5*4%3
        //          3+10%3
        //           3+1
        //             4
        System.out.println("num1 = "+  num1);


    }

}
