package day17_Methods;

import java.util.Scanner;

public class C02_Bank_Question {
    public static void main(String[] args) {
        //   Banka menüsü oluşturun 1 para ekle 2 hesabımı gör 3 para çek 4 çıkış  (money=2000)
        //  while işleme devam etmek için 1 e basın bir üst menü için 2 basın kart iade 3

        double money=2000;
        Scanner scan=new Scanner(System.in);

        outerLoop: while(true) {

            System.out.println("1: Para ekle 2: Para çek 3: Bakiye 4: çıkış");
            System.out.println("Yapmak istediğiniz işlemi seçiniz");
            int tercih = scan.nextInt();
            switch (tercih) {
                case 1:
                            while (true) {
                                System.out.println("Eklemek istediğiniz tutarı giriniz : ");
                                double paraEklenen = scan.nextDouble();
                                money += paraEklenen;

                                System.out.println("Bir üst menü için 1 basınız, işleme devam etmek için 2, kart iade için 3 e basınız");
                                int tercih2 = scan.nextInt();
                                if (tercih2 == 1) {
                                    break;
                                } else if (tercih2 == 2) {
                                    continue;
                                } else {
                                    System.out.println("hatalı işlem için kart iade ediliyor");
                                    break outerLoop;

                                }
                                }
                    break ;
                case 2:
                                while (true) {
                                    System.out.println("Çekmek istediğiniz tutarı giriniz : ");
                                    double paraCekilen = scan.nextDouble();
                                    if (paraCekilen>money){
                                        System.out.println("Hesap bakiyeniz yetersizdir.");
                                        System.out.println("Çekebileceğiniz maksimum tutar : "+money+ " USD dır.");
                                        continue outerLoop;
                                    }
                                    money -= paraCekilen;

                                    System.out.println("Bir üst menü için 1 basınız, işleme devam etmek için 2");
                                    int tercih2 = scan.nextInt();
                                    if (tercih2 == 1) {
                                        break;
                                    } else if (tercih2 == 2) {
                                        continue;
                                    } else {
                                        System.out.println("hatalı işlem için kart iade ediliyor");
                                        break outerLoop;

                                    }
                                }
                    break ;

                case 3:
                                    System.out.println("Bakiyeniz ="+ money);
                    break ;

                case 4:
                    break outerLoop;

                default:
                    System.out.println("Hatalı giriş yaptınız tekrar deneyiniz");
            }

        }
    }
}
