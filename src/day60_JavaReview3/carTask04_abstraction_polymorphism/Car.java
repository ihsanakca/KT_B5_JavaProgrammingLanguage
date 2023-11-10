package day60_JavaReview3.carTask04_abstraction_polymorphism;

public abstract class Car {

    public String make, model, color;
    public int year;
    public double price;

    public static int numberOfWheels=4;

    public abstract void start();


    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
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


