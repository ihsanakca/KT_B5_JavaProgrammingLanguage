package day47_Polymorphism;

import day44_AbstracClassAndInterface.animal.Animal;
import day44_AbstracClassAndInterface.animal.Cat;
import day44_AbstracClassAndInterface.animal.Dog;

public class C01_Polymphism {
    public static void main(String[] args) {


        Animal animal = new Dog("Panco", "Golden", 'm', 10, "Medium", "Gold"); //polymorhism
        Dog dog = new Dog("Lucky", "Husky", 'f', 7, "Large", "White");

        boolean isAnimal = animal instanceof Animal;
        System.out.println(isAnimal);
        boolean isDog = animal instanceof Dog;
        System.out.println(isDog);
        boolean isCat = animal instanceof Cat;
        System.out.println(isCat);

        System.out.println("--------------------------");
        animal.eat();
        animal.drinkWater();

        System.out.println("--------------------------");
        ((Dog)animal).bark();// Explicit casting downcasting
        ((Dog)animal).play();

        animal = new Cat("Panco", "Golden", 'm', 10, "Medium", "Gold");
        animal.eat();
        ((Cat)animal).meow();

        Cat cat = new Cat("Bulut","Scottish",'m',4,"Medium","Gray");
        Animal animal1 = cat;
        System.out.println(animal1);
        animal1.eat();
        animal1.drinkWater();
        System.out.println(animal1.getBreed());

        System.out.println(animal1 instanceof Cat);
        System.out.println(animal1 instanceof Animal);

        System.out.println("----------------------------");


    }

}
