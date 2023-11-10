package day60_JavaReview3.carTask04_abstraction_polymorphism;

public class Tesla extends Car implements AutoPilot{


    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    public void autoPilot(){
        System.out.println(make+ " "+ model+" is in autopilot mode");
    }

    @Override
    public void start(){
        System.out.println("Clap your hands to start"+ make);
    }
}
