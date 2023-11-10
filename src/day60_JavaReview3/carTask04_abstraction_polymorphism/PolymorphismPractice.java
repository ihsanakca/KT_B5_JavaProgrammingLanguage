package day60_JavaReview3.carTask04_abstraction_polymorphism;

public class PolymorphismPractice {

    public static void main(String[] args) {

        Car car= new Toyota("Corolla","blue",2019,75000);
        car.start();

        AutoPilot autoPilot= new Airplane();

        Car electricCar= new Tesla("Model S","red",2023,100000);
        electricCar.start();
        //electricCar.autoPilot();


        //((BMW) electricCar).start();

        ((Tesla)electricCar).autoPilot();


        //electricCar= new BMW("X5","white",2017,65000);

        //electricCar.start();












    }
}
