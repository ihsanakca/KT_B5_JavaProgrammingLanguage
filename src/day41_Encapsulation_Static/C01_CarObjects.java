package day41_Encapsulation_Static;

public class C01_CarObjects {
    public static void main(String[] args) {


        Car car1 = new Car();
        System.out.println(Car.tekerlekSayisi); // Class ismiyle erisilir
        Car car2 = new Car();
//        car2.beygir = -10;
        car2.setBeygir(-10);
        System.out.println("car2.beygir = " + car2.getBeygir());
        car2.tekerlekSayisi=5;
        System.out.println(car1.tekerlekSayisi);
        System.out.println(car2.tekerlekSayisi);

//        Car car3 = new Car("Honda",2020,250,false);
//        System.out.println(car3);

        Car car4 = new Car("Honda",2020,"1321321321asdasasd","1232456456ASDASDASD",250,true,false);
        System.out.println(car4);

//        car4.setMotorNo("1234ASAAAAAAAAAAAA");

        car4.setSaseNo("111111111111111111111111");
        System.out.println(car4);


    }
}
