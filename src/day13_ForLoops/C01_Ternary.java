package day13_ForLoops;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen Pozitif Bir Sayi Giriniz: ");
        int num = scanner.nextInt();

        if(num%2==0) {
            System.out.println("Cift Sayi");
            System.out.println("Hellooo Hellooo");
        }
        else {
            System.out.println("Tek Sayi");
            System.out.println("Hello");
        }

        System.out.println("--------------------------------");
        System.out.println( num%2==0 ? "Cift Sayi" : "Teksayi");

        System.out.println("--------------------------------");

//        String result = (num%2==0) ? ("Cift Sayi") : ("Teksayi");
        String result = "Tek Sayi";
        System.out.println("result = " + result);


    }

}
/*
* Kullanicidan pozitif bir tamsayi alin
* sayi cift ise "cift sayi"
* sayi tek ise "tek sayi"
* yazdirin
* */