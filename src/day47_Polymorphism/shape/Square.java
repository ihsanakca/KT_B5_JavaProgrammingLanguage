package day47_Polymorphism.shape;

public class Square extends Shape {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side < 0) {
            System.err.println("Invalid Side Length " + side);
        } else {
            this.side = side;
        }
    }

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public void katla(){
        System.out.println("Kare Katlaniyor");
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "} " + super.toString();
    }
}
