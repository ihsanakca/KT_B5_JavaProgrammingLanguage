package day16_PRACTICE;

public class C08_MethodAsalSayiFlag {
    public static void main(String[] args) {
        asalMiYazdir(23);

    }

    public static void asalMiYazdir(int sayi) {
        int flag = 0;

        for (int i = 2; i < sayi / 2; i++) {
            if (sayi % 2 == 0) {
                flag++;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Girilen " + sayi + " sayisi ASAL'dır");
        } else {
            System.out.println("Girilen " + sayi + " sayisi ASAL DEĞİL'dir");
        }
    }

}