package day50_Week10_Review.animalTaskPolymorphism;

public class Zoo {

    public static void main(String[] args) {

        Animal animal1= new Dog("Lessie","Husky",2,"Small","White");

        Animal animal2= new Cat("Tarcin","British",3,"Small","Brown");

        Animal animal3= new Tiger("Vahşi","Bengal",4,"Large","Orange");

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);


        animal1.eat(); //reference--->accessibility
        animal1.drink();
        ((Dog) animal1).play();
        ((Dog) animal1).bark();

        animal2.eat();
        animal2.drink();
        ((Cat) animal2).play();
        ((Cat) animal2).meow();

        animal3.eat();
        animal3.drink();
        ((Tiger)animal3).hunt();

    }


    }

