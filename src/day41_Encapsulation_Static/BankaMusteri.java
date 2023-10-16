package day41_Encapsulation_Static;

import java.util.Random;

public class BankaMusteri {
    private String adSoyad;
    private String hesapNo;
    private double bakiye;
    static private final String SIFRE = "SAFAK";

    private static int count =1;

    static {
        System.out.println("Static Block calisti");
    }

    {
        System.out.println("Instance Blok Calisti");
        this.hesapNo = hesapNoOlustur();
    }



    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        if(adSoyad.isBlank() || adSoyad.isEmpty()){
            return;
        }
        this.adSoyad = adSoyad;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo, String sifre) {
       if(sifre.equals(SIFRE)){
        this.hesapNo = hesapNo;
       }else {
           System.err.println("Sifre Yanlis Hesap No degistirme Yetkiniz Yok!");
       }
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }




    public BankaMusteri(){
    }

    public BankaMusteri(int bakiye){
        this.bakiye=bakiye;
    }

    public BankaMusteri(String adSoyad, double bakiye) {
        this.adSoyad = adSoyad;
        this.bakiye = bakiye;

    }

    public static String hesapNoOlustur(){
        Random random = new Random();
        int x = random.nextInt(9999999)+10000000;
        String hesapNo = count+"2023"+x;
        count++;
        return hesapNo;
    }

    public void paraEkle(double para){
        bakiye += para;
    }
    public void paraCek(double para){
        if(bakiye>para){
            bakiye -= para;
        }else{
            System.err.println("Yetersiz Bakiye");
        }
    }

    @Override
    public String toString() {
        return "BankaMusteri{" +
                "adSoyad='" + adSoyad + '\'' +
                ", hesapNo='" + hesapNo + '\'' +
                ", bakiye=" + bakiye +
                '}';
    }
}
