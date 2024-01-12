package day14_ForLoopsPractice;

public class C01_Practice_1 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan pozitif bir tamsayi alin, 1’den
        girilen sayiya kadar(girilen sayi
        dahil) 7 ila bolunebilen sayilari yazdirin

         */

        int number = 77;

        for (int i = 1; i <= 77; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }


        System.out.println();
        System.out.println("----------");
        // girilen sayıyı tersten yazdırın

        int sayi = 982;
        int tersSayi = 0;

        for (; sayi != 0; sayi /= 10) {
            int sonBasamak = sayi % 10;
            tersSayi = tersSayi * 10 + sonBasamak;
        }

        System.out.println("Girilen sayının tersi " + tersSayi + "'dir.");

        /*
        Soru 4- Kullanicidan baslangic ve bitis degeri olarak
        pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //eğer start finishden büyükse swap yapın..

         */

        int start = 75;
        int finish = 15;

        if (start > finish) {
            int temp = start;
            start = finish;
            finish = temp;
        }

        int sum = 0;

        for (int i = start; i <= finish; i++) {
            sum += i;
        }

        System.out.println(start + "'den " + finish + "'ya kadar olan sayıların toplamı : " + sum + "'dir.");

        /*
        Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

         */

        int a = 10;
        int factorial = 1;

        System.out.print(a + "! = ");

        for (int i = a; i >= 1; i--) {
            factorial *= i;
            if (i != 1)
                System.out.print(i + " * ");
            else if (i == 1)
                System.out.print(i + " ");
            ;
        }
        System.out.println("= " + factorial);

        System.out.println("-------------");


      //  int z=1;

        for (; ; ) {
            System.out.print("aaaaa");
       //     z++;
         //   if (z==5) break;
        }

        // int h = 5;  // buraya kod yazdırmaz
    }
}
