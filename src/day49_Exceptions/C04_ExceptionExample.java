package day49_Exceptions;

import java.util.Scanner;

public class C04_ExceptionExample {
    /**
     * while ve for loop kullanmadan kullanıcıya 3 hak verin ve int değeri doğru girmez ise
     * kullanıcıya ikaz verisin, doğru girer ise sayıyı yazdırsın
     */

    public static void main(String[] args) {


        System.out.println(sayiGiris());


    }

    private static int count=0;
    public static int sayiGiris(){
        try{
            Scanner scan=new Scanner(System.in);
            System.out.println("sayi: ");
            int x= scan.nextInt();
            count=0;
            System.out.println(count);
            return x;

        }catch (Exception e){
            count++;
            if(count==3){
                System.out.println("hakkınız kalmamıştır");
                count=0;
                System.out.println(count);
                System.exit(0);

            }
            System.out.println(3-count+" hakkınız kaldı, lütfen tekrar deneyiniz");
            return sayiGiris();
        }
    }
}
