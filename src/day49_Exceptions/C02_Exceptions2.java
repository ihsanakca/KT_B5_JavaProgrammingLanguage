package day49_Exceptions;

import java.util.Scanner;

public class C02_Exceptions2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");

        try{
            int x = scan.nextInt();

            System.out.println(x * 10);// a----  g,rilirse   InputMismatchException

            System.out.println(5/x);  // 0 girersek --lang.ArithmeticException: / by zero

        }catch (Exception e){
            System.out.println("Hata alındı"+e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Kod devam ediyor");
        System.out.println("Kod devam ediyor");
        System.out.println("Kod devam ediyor");
    }
}
