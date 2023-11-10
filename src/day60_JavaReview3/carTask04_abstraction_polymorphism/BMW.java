package day60_JavaReview3.carTask04_abstraction_polymorphism;

public class BMW extends Car {


    public BMW( String model, String color, int year, double price) {
        super("BMW", model, color, year, price);
    }

    public void openSunroof(){
        System.out.println(make+ " "+ model+" is opening sunroof");
    }


    @Override
    public void start() {
        System.out.println("press start button");
    }

    @Override
    public String toString() {
        return "BMW{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
