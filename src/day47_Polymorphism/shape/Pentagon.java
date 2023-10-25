package day47_Polymorphism.shape;

public class Pentagon extends Shape {
    private int side;

    public Pentagon(int side) {
        super("Pentagon");
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
