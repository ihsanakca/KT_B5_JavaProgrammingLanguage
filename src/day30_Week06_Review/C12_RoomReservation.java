package day30_Week06_Review;

import java.util.Scanner;

public class C12_RoomReservation {

    public static void main(String[] args) {

        int odaFiyatı = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Oda rezervasyonu istiyor musunuz: Evet/Hayır");
        String rezervasyon = scanner.nextLine();

        while (!(rezervasyon.equals("Evet") || rezervasyon.equals("Hayır"))) {
            System.out.println("Geçersiz cevap: Yeniden giriniz: Evet/Hayır");
            rezervasyon = scanner.nextLine();
        }
        if (rezervasyon.equals("Hayır")) {
            System.out.println("Güle Güle!!!!");

        } else if (rezervasyon.equals("Evet")) {
            System.out.println("Oda türünüz ne?");
            String odaTuru = scanner.nextLine();
            while (!(odaTuru.equals("King Bed") || odaTuru.equals("Queen Bed") || odaTuru.equals("Single Bed"))) {
                System.out.println("Geçersiz oda türü: Yeniden giriniz");
                odaTuru = scanner.nextLine();
            }
            if (odaTuru.equals("King Bed")) {
                odaFiyatı += 120;

            }
            if (odaTuru.equals("Queen Bed")) {
                odaFiyatı += 100;

            }
            if (odaTuru.equals("Single Bed")) {
                odaFiyatı += 80;

            }
            System.out.println((odaTuru + " $" + odaFiyatı));

        }

    }


}

