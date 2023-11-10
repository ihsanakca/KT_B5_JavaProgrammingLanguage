package day60_JavaReview3.carTask02_encapsulation;

public class CarObjects {
    public static void main(String[] args) {

        Car obj= new Car();
        System.out.println(obj.getColor());
        System.out.println(obj.getMake());
        obj.setColor("blue");
        System.out.println(obj.getColor());
        System.out.println(Car.getNumberOfWheels());
        Car.setNumberOfWheels(3);
        System.out.println(Car.getNumberOfWheels());



    }
}
