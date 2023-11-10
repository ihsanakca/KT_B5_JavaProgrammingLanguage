package day60_JavaReview3;

public class Abst {

    public static void main(String[] args) {

        Honda honda= new Honda();
        honda.start();
        honda.stop();



    }
}

abstract class Car{
    public abstract void start();
    public void stop(){
        System.out.println("stopping");
    }

}

class Honda extends Car{
    public void start(){
        System.out.println("Press remote start button");
    }

}