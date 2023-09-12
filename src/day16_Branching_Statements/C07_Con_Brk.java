package day16_Branching_Statements;

import java.util.Scanner;

public class C07_Con_Brk {
    public static void main(String[] args) {
        //Kullanıcıdan 2 adet sayı alın ve bunları toplayın 2
// sayısının toplamı 25 ise programdan çıkış işlemi gerçekleştirin.
// 25 değil ise program kullanıcıdan iki sayı almaya devam etsin.

        Scanner scan=new Scanner(System.in);

        System.out.println("program başladı");

        while(true) {

            System.out.print("x : ");
            int x = scan.nextInt();
            System.out.print("y : ");
            int y = scan.nextInt();
            int result = x + y;

            if (x==0&&y==0){
               break;
            }

            if (result>=25){
                System.out.println("Toplam 25 e eşit veya büyük olduğu için sonuç veremiyoruz. Tekrar deneyinz");
                continue;
            }
            System.out.println("toplam : " + result);


        }
    }
}
