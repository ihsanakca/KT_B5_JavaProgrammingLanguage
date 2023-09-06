package day11_ControlFlowwStatement_IF;

import java.util.Scanner;

public class C05_ClassTask2 {
    public static void main(String[] args) {
        /*
        hava sıcaklığı isminde bir değişken declere edin ve değer atayın
        sıcaklık 20 derece üzerinde ise hava sıcak yazsın
        sıcaklık 20 derece ve altında ise hava soğuk yazsın
         */

        double temp=20.01;

        if (temp>20){
            System.out.println("hava sıcak");
        }else {
            System.out.println("hava soğuk");
        }
        System.out.println("program bitti");



        /*
        Class Task 2
        kullanıcıdan bir tam sayı alın
        ekrana tek mi çift mi olduğunu yazdırın
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz :");
        int number= scan.nextInt();

        boolean result=(number%2==1);

        if (result){
            System.out.println(number+" sayısı tektir.");
        }else {
            System.out.println(number+" sayısı çifttir.");
        }

        System.out.println("program bitti.");

    }
}
