package day16_PRACTICE;

import java.util.Scanner;

public class C02_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fibonacci serisi için iki rakam giriniz");

        double ilkSayi = scanner.nextDouble();
        double ikinciSayi = scanner.nextDouble();

        for (int i = 0; i < 100; i++) {
            System.out.println(ilkSayi);
            System.out.println(ikinciSayi);
            ilkSayi += ikinciSayi;
            ikinciSayi += ilkSayi;

            //altın oran
            double d = ikinciSayi / ilkSayi;
            System.out.println("d = " + d);
        }
    }
}
