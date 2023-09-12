package day16_Branching_Statements;

import java.util.Scanner;

public class C08_FindPassword {
    public static void main(String[] args) {
        //   // Şifre tanımlayın ve kullanıcıya ekrandan
//// 5 defa şifreyi girmesini isteyin. Her bulamadığında şifre doğru değildir tekrar deneyin ikazı çıksın.
//// Şifreyi bulursa «tebrikler şifre doğru» yazısı gösterildikten sonra programdan çıkış işlemi gerçekleşsin.

        Scanner scanner=new Scanner(System.in);

        String password="şafak";

        System.out.println("Toplam 5 hakkınız bulunmaktadır.");

        int hak=5;
        boolean flag=true;
        while (flag){
            System.out.println("Tahmin :");
            String tahmin = scanner.next();

            if (tahmin.equalsIgnoreCase(password)){

                System.out.println("Tebrikler");
                break;
            }

            hak--;
            if (hak==0){
                System.out.println("hatalı tahmin hakkınız doldu.");
                flag=false;
                continue;
            }

            System.out.println("Tekrar deneyiniz");
        }


    }
}
