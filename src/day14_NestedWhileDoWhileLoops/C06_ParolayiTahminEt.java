package day14_NestedWhileDoWhileLoops;

import java.util.Scanner;

public class C06_ParolayiTahminEt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parola = "safak";
       // String tahmin = "";
        int hak = 3;
        System.out.println("Lutfen Parolayi Tahmin Ediniz (toplam 3 hakkiniz bulunmaktadir) : ");


        while (0 < hak) {
            String tahmin = scanner.nextLine();
            if (tahmin.equalsIgnoreCase(parola)) {
                System.out.println("Tebrikler. Parolayi bildiniz");
                break;
            } else {
                System.out.println("Parola yanlis. Kalan tahmin hakkiniz : " + (--hak));
            }

        }


    }

}
