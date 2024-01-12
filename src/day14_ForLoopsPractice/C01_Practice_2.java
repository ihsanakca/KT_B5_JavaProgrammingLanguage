package day14_ForLoopsPractice;

public class C01_Practice_2 {
    public static void main(String[] args) {



        /*
        Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

         */

        int number = 255;
        int sum = 0;
        for (; number != 0; number /= 10) {
            int sonBasamak = number % 10;
            sum += sonBasamak;
        }

        // Toplamı ekrana yazdırma
        System.out.println("Rakamların toplamı: " + sum);

        System.out.println("---------------");


        /*

        //verilen sayıya kadar olan çarpım tablosunu yazdıralım

        1 2 3 4     -->     1*1 1*2 1*3 1*4
        2 4 6 8     -->     2*1 2*2 2*3 2*4
        3 6 9 12    -->     3*1 3*2 3*3 3*4
        4 8 12 16   -->     4*1 4*2 4*3 4*4

         */
        int sayi = 6;
        for (int i = 1; i <= sayi; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= sayi; i++) {
            System.out.print(2 * i + " ");
        }
        System.out.println();
        for (int i = 1; i <= sayi; i++) {
            System.out.print(3 * i + " ");
        }
        System.out.println();
        for (int i = 1; i <= sayi; i++) {
            System.out.print(4 * i + " ");
        }
        System.out.println();
        System.out.println("---------------");

        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= sayi; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        System.out.println("---------------");


        /*
        1               1. satir 1’den 1’e kadar yazdir
        1 2             2. satir 1’den 2’e kadar yazdir
        1 2 3           3. satir 1’den 3’e kadar yazdir
        1 2 3 4         4. satir 1’den 4’e kadar yazdir

         */

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------");

        int count = 6; int sayac=1;
        for (int i = 1; i <=count ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(sayac++ +" ");
            }
            System.out.println();
        }
    }
    public static void ucgen(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
