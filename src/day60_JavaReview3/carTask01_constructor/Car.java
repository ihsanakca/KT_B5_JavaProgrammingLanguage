package day60_JavaReview3.carTask01_constructor;

public class Car {

    public String make, model, color; //instance ---> objeye ait
    public final int year=2020;
    public double price;

    public static int numberOfWheels; //static ---> Class'a ait

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, String model) {
        this(make);
        this.model = model;

    }

    public Car(String make, String model, String color) {
        this(make,model);
        this.color = color;
    }

    public Car(String make, String model, String color, double price) {
        this(make, model, color);
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
