package day44_AbstracClassAndInterface.animal;

public class Cat extends Animal implements Playable {
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating liver");
    }

    @Override
    public void play() {
        System.out.println(getName()+ " is playing with mouse");
    }

    public void meow(){
        System.out.println(getName()+" is meowing");
    }

//    public void drink(){
//        System.out.println(getName()+" is drinking Milk");
//    }
}
