package day50_Week10_Review.animalTaskPolymorphism;

public final class Dog extends Animal implements Playable {

    public Dog(String name, String breed, int age, String size, String color) {
        super(name, breed, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating dog food");
    }


    @Override
    public void play() {
        System.out.println(getName()+ " is playing with cat");
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }
}
