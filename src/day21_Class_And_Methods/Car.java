package day21_Class_And_Methods;

public class Car {
    /*
         Fields marka, model, renk, hiz
         Methods calistir, hizlan, dur
         Javada Car class oluşturun?

          */
    String marka;
    public String model;
    String renk;
    int hız;

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
