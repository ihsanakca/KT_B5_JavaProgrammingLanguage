package day60_JavaReview3.carTask04_abstraction_polymorphism;

public class Toyota extends Car {
    @Override
    public void start() {
        System.out.println("say start");
    }

    public Toyota(String model, String color, int year, double price) {
        super("Toyota", model, color, year, price);
    }


}
