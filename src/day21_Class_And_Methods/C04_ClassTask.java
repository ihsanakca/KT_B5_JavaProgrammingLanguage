package day21_Class_And_Methods;

import java.util.Scanner;

public class C04_ClassTask {
//Konsoldan
    //kullanıcıdan 2 sayı almanızı sağlayan bir
    //metodu çağırın İkinci sayı 3 ün katı olan bir sayı değilse,
    //başka bir metodtan geçirin ve 3 katı olacak ş ekilde size
    //döndürsün Sonra bu sayıları kabul eden başka bir
    //metotla da sayıları toplayın

    public static void main(String[] args) {
        sayiAl();
    }

    private static int sayiAl() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. sayi : ");
        int sayi1= scanner.nextInt();
        System.out.println("2. sayi : ");
        int sayi2= scanner.nextInt();

            return sayi1+ucunKatı(sayi2);
    }

    private static int ucunKatı(int sayi2) {
        if (sayi2%3==0){
            return sayi2;
        }else {
            return sayi2-sayi2%3;
        }
    }



}
