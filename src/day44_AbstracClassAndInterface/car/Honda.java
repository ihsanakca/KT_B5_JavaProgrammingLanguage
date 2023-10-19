package day44_AbstracClassAndInterface.car;

public final class Honda extends Car { // concrete bir class abstract methodlar override edilmeli

    public Honda(String model,String color,int year,double price){
        super("Honda",model,color,year,price);
    }

    public void start(){
        System.out.println("twist the key to start");
    }

    public void stop(){
        System.out.println("VTEC engine needs a perfect braking system. Hold On");
    }



}
