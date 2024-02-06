package day30_RANDOM_MATH_DATE_Classes;

import java.util.Random;
import java.util.Scanner;

public class C04_RandomDice {
    public static void main(String[] args) {
        System.out.println("Lutfen 2 zar ile ulasmak istediginiz sayiyi belirtiniz!");
        Scanner sc = new Scanner(System.in);
        int zarToplam = sc.nextInt();

        Random r1 = new Random();
        Random r2 = new Random();

        int zar1, zar2;
        int attempts = 0;
        do {
            zar1 = r1.nextInt(6) + 1;
            zar2 = r2.nextInt(6) + 1;
            System.out.println(zar1 + " + " + zar2 + " = " + (zar1 + zar2));
            attempts++;
        } while (zar1 + zar2 != zarToplam);

        System.out.println("Your number came up after " + attempts + " times attempt");
    }
}