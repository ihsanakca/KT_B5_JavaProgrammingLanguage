package day12_IF_SwitchCase;

import java.util.Scanner;

public class C04_Calculator {
    public static void main(String[] args) {
        //+,-,*,/
        // 4 işlem yapacak şekilde bir hesap makinesi yapın
        // kullanıcıdan 2 sayı alın
        //yapmak istediği işlemi seçsin +,-,*,/
        //hatalı işlem girişlerinde kullanıcıya uyarı verin
        //ekrana sonuç döndüren programı yazınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("Sayı 1 : ");
        double x= scan.nextDouble();
        System.out.println("Sayı 2 : ");
        double y= scan.nextDouble();
        System.out.println("Lütfen yapılacak işlemi giriniz :");
        String islem=scan.next();

        // islem=="+"
        if (islem.equals("+")){
            System.out.println(x+y);
        } else if (islem.equals("-")) {
            System.out.println(x-y);
        }else if (islem.equals("*")) {
            System.out.println(x*y);
        }else if (islem.equals("/")) {
            System.out.println(x/y);
        }else{
            System.out.println("Hatalı işlem girdiniz");
        }


        String str1="A";
        String str2="A";
        boolean b= str1.equals(str2);

    }
}
