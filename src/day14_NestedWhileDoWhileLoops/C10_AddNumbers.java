package day14_NestedWhileDoWhileLoops;

import java.util.Scanner;

public class C10_AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        System.out.print("Lutfen bir sayi giriniz : ");
        int n = scanner.nextInt();
        sum=n;
        while (n!=0){
            System.out.print("Toplanmasini istediginiz sayiyi girin (Cikmak icin 0 girin) : ");
            n=scanner.nextInt();
            sum+=n;
        }
        System.out.println("sum = " + sum);


    }


}
 /*   Kullanıcıdan devamlı sayı isteyen ve bu sayıları toplayan
        programı yazınız. Kullanıcı 0 girdiğinde programdan çıkması
        sağlanmalıdır.*/