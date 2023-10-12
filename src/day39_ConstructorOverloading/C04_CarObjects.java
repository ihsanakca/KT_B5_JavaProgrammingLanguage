package day39_ConstructorOverloading;

public class C04_CarObjects {


    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("car1.otomatikMi = " + car1.otomatikMi);
        System.out.println("car1.marka = " + car1.marka);
        System.out.println("car1.renk = " + car1.renk);

        System.out.println("----------------------------");

        Car car2 = new Car("VW");
        System.out.println("car2.marka = " + car2.marka);
        System.out.println("car2.model = " + car2.model);
        System.out.println("car2.hiz = " + car2.hiz);

        Car car3 = new Car("Honda","Accord","Siyah");
        System.out.println(car3);

        Car.renkSec(car3,"Beyaz");
        System.out.println(car3);


    }
}
