package day60_JavaReview3.carTask00_static_instance;

public class CarObjects {

    public static void main(String[] args) {
       Car car= new Car();
       car.show();
        System.out.println(car);
        System.out.println(Car.numberOfWheels);
        //System.out.println(car.numberOfWheels); // Class ile çağrılmalı

    }




}

class Car{

    public String make, model, color; //instance ---> objeye ait
    public final int year=2020;
    public double price;

    public static int numberOfWheels; //static ---> Class'a ait


    public void show(){ //instance metot
        System.out.println(make+ " : "+ model+ " : "+ year );
    }
    public static void show1(){ //static metot
        System.out.println(numberOfWheels);
    }

    static{ // 1 defa ve ilk olarak çalışır. Static variable initialize için kullanılabilir.
        numberOfWheels=4;
        System.out.println("in static block");

    }

    public Car(){
        make= "Toyota";
        //year=2023;
        System.out.println("in constructor");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
