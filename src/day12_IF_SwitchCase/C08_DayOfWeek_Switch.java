package day12_IF_SwitchCase;

import java.util.Scanner;

public class C08_DayOfWeek_Switch {
    public static void main(String[] args) {
        // haftanın gününü kullanıcıdan alın ve ekrana o günün ismini yazdırın
        // 1 Pazartesi
        // 3  çarşamba
        // 7 Pazar

        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz :");
        int gun=input.nextInt();

        switch (gun){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatalı giriş");
        }
    }
}
