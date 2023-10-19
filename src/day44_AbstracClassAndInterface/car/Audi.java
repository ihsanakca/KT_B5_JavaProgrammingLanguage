package day44_AbstracClassAndInterface.car;

public class Audi extends Car{

    public Audi(String model,String color,int year,double price){
        super("Audi",model,color,year,price);
    }

    public void start(){
        System.out.println("push the start button");
    }

    public void quatro(){
        System.out.println("Quattro feature is active");
    }

    public void autoPark(){
        System.out.println("Audi is autoparking");
    }

}
