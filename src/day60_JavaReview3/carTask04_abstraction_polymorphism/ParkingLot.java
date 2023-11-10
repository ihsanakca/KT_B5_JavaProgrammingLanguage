package day60_JavaReview3.carTask04_abstraction_polymorphism;

public class ParkingLot {

    public static void main(String[] args) {

        //Car car= new Car();

        BMW bmw = new BMW("X5","black",2023,100000);
        Tesla tesla= new Tesla("Model 50","gray",2022,150000);

        System.out.println(bmw);

        bmw.start();
        bmw.openSunroof();

        tesla.start();
        tesla.autoPilot();
        System.out.println("Tesla.numberOfWheels = " + Tesla.numberOfWheels);


    }
}
