package day20_PRACTICE;

import java.util.Scanner;

public class AdetYazdir {

    public static void main(String[] args) {
        adetYazdir();
    }

    public static void adetYazdir() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Yazdırılacak kişinin adını ve yazdırma adedini giriniz (Çıkış için x'basınız)");
            String ad = scanner.nextLine();
            if (!ad.equals("x")) {
                int adet = scanner.nextInt();
                scanner.nextLine();
                for (int i = 1; i <= adet; i++) {
                    System.out.print(ad + " ");
                }
                System.out.println();
            }
            else {
                System.out.println("Çıkış yaptınız");
                break;

            }

        }
    }
}