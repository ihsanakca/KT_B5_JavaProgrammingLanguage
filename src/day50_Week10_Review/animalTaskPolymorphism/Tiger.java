package day50_Week10_Review.animalTaskPolymorphism;

public class Tiger extends Animal implements WildAnimal {

    public Tiger(String name, String breed, int age, String size, String color) {
        super(name, breed, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating deer");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting a deer");
    }
}
