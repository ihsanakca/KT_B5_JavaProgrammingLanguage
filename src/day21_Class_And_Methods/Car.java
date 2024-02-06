package day21_Class_And_Methods;

public class Car {
    /*
         Fields marka, model, renk, hiz
         Methods calistir, hizlan, dur
         Javada Car class oluşturun?

          */
    public String marka;
    public String model;
    public String renk;
    public int hız;
    public static int tekerSayisi;

    public boolean isElectrical;

    public void calistir(){
        System.out.println(model+ "   çalıştı");
    }
    public void hızlan(){
        System.out.println(model+"  hızlandı");
    }
    public void dur(){
        System.out.println(model+"  durdu");
    }


}


