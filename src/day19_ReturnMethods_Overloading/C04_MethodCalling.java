package day19_ReturnMethods_Overloading;

import java.util.Scanner;

public class C04_MethodCalling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Faktoriyeli hesaplanacak sayiyi giriniz");
        int num = scanner.nextInt();

        if (num < 0) {
            System.err.println("Lutfen 0 yada pozitif sayi giriniz!");
        } else {
            System.out.println("C03_Faktoriyel.faktoriyel(num) = " + C03_Faktoriyel.faktoriyel(num));
        }


    }


}
