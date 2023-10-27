package day50_Week10_Review.animalTaskPolymorphism;

public class Cat extends Animal implements Playable {

    public Cat(String name, String breed, int age, String size, String color) {
        super(name, breed, age, size, color);
    }

    @Override
    public void eat() {

    }

    @Override
    public void play() {
        System.out.println(getName()+ " is playing with mouse");
    }

    public void meow(){
        System.out.println(getName() + " is Meowing");
    }
}
