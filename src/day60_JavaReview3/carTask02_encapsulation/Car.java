package day60_JavaReview3.carTask02_encapsulation;

public class Car {

    private String make, model, color; //instance ---> objeye ait
    private int year;
    private double price;

    private static int numberOfWheels = 4; //static ---> Class'a ait

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getNumberOfWheels() {
        return numberOfWheels;
    }

    public static void setNumberOfWheels(int numberOfWheels) {
        Car.numberOfWheels = numberOfWheels;
    }
}
