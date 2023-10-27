package day50_Week10_Review;

import day50_Week10_Review.animalTaskPolymorphism.Animal;
import day50_Week10_Review.animalTaskPolymorphism.Cat;
import day50_Week10_Review.animalTaskPolymorphism.Dog;
import day50_Week10_Review.animalTaskPolymorphism.Tiger;

import java.util.ArrayList;

public class AnimalPolymorphismPractice {

    public static void main(String[] args) {

        Animal [] animals = {
                new Dog("Lessie", "Husky", 2, "Small", "White"),
                new Dog("Lilly", "Husky", 5, "Large", "Black"),
                new Cat("Tarcin", "British", 3, "Small", "Brown"),
                new Cat("Pamuk", "British", 1, "Small", "White"),
                new Tiger("Vahşi", "Bengal", 4, "Large", "Orange"),
                new Tiger("Woody", "Malayan", 5, "Large", "Golden"),
        };

        ArrayList<Animal> pets = new ArrayList<>();

        for (Animal each : animals) {
            if (each instanceof Dog || each instanceof Cat) {
                pets.add(each);
            }
        }

        System.out.println(pets);
        System.out.println(pets.size());

        ArrayList<Animal> wildAnimals = new ArrayList<>();

        for (Animal each : animals) {
            if (each instanceof Tiger) {
                wildAnimals.add(each);
            }
        }
        System.out.println(wildAnimals);
        System.out.println(wildAnimals.size());

        System.out.println("---------------------------");

        for (Animal each : animals) {
            if (each.getAge()>4) {
                System.out.println(each);
            }
        }
        System.out.println("---------------------------");

        for (Animal each : animals) {
            if (each.getColor().equals("White")) {
                System.out.println(each);
            }
        }

    }
}
