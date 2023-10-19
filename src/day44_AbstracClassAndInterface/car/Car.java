package day44_AbstracClassAndInterface.car;

public abstract class Car {
    private String brand,model;
    private String color;
    private int year;

    private double price;


    public Car(){
    }
    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        setColor(color);
        if(year<1886){
            System.err.println("invalid Year "+year);
        }else {
            this.year=year;
        }
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
        if(price<0){
            System.err.println("Invalid Price "+price);
        }else {
        this.price = price;
    }
    }


    public void stop(){
        System.out.println("Step on the brake");
    }

    public abstract void start();






    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

/*Car Task:
	abstract Car:
		make, model, color, year, price....
		start();
		stop()

	Honda extends Car:
		start(): twist the key to start

	Audi extends Car:
		start(): push the start button

	Togg extends Car:
		start(): Say "Start"*/
