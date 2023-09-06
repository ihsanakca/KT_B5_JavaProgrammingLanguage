package day12_IF_SwitchCase;

import java.util.Scanner;

public class C07_CalculatorWithSwitch {
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

        switch (islem){
            case "+":
                System.out.println(x+y);
                break;
            case "-":
                System.out.println(x-y);
                break;
            case "*":
                System.out.println(x*y);
                break;
            case "/":
                System.out.println(x/y);
                break;
            default:
                System.out.println("hatalı işlem girdiniz");
        }


    }
}
