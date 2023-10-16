package day41_Encapsulation_Static;

public class C02_BankaMusteriObjects {
    public static void main(String[] args) {
        BankaMusteri hesapNo1 = new BankaMusteri(1500);
        hesapNo1.setAdSoyad("SametSarioglu");
        System.out.println(hesapNo1);
        BankaMusteri hesapno2 = new BankaMusteri("Ahmet Arikan",15000);
        System.out.println(hesapno2);

        hesapNo1.paraEkle(58000);
        System.out.println(hesapNo1);

        hesapno2.paraCek(20000);
        System.out.println(hesapno2);

        hesapNo1.paraCek(59499);
        System.out.println(hesapNo1);

        hesapno2.setHesapNo("123456789","basak");
        System.out.println(hesapno2);

        BankaMusteri hesapno3 = new BankaMusteri("Mehmet Arikan",7000);

    }
}
