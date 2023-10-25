package day47_Polymorphism;

import day44_AbstracClassAndInterface.animal.Animal;
import day44_AbstracClassAndInterface.animal.Cat;
import day44_AbstracClassAndInterface.animal.Dog;
import day47_Polymorphism.shape.Circle;
import day47_Polymorphism.shape.Cube;
import day47_Polymorphism.shape.Shape;
import day47_Polymorphism.shape.Square;

import java.util.Arrays;

public class C01_Polymphism {
    public static void main(String[] args) {


        Animal animal = new Dog("Panco", "Golden", 'm', 10, "Medium", "Gold"); //polymorhism
        Dog dog = new Dog("Lucky", "Husky", 'f', 7, "Large", "White");

//        Dog dog = new Animal();

        boolean isAnimal = animal instanceof Animal;
        System.out.println(isAnimal);
        boolean isDog = animal instanceof Dog;
        System.out.println(isDog);
        boolean isCat = animal instanceof Cat;
        System.out.println(isCat);

        System.out.println("--------------------------");
        animal.eat();
        animal.drinkWater(); //Animal

        System.out.println("--------------------------");
        ((Dog) animal).bark();// Explicit casting downcasting
        ((Dog) animal).play();

        animal = new Cat("Panco", "Golden", 'm', 10, "Medium", "Gold");
        animal.eat();
        ((Cat) animal).meow();

        Cat cat = new Cat("Bulut", "Scottish", 'm', 4, "Medium", "Gray");
        Animal animal1 = cat;
        System.out.println(animal1);
        animal1.eat();
        animal1.drinkWater();
        System.out.println(animal1.getBreed());

        System.out.println(animal1 instanceof Cat);
        System.out.println(animal1 instanceof Animal);

        System.out.println("----------------------------");

//        Shape shape = new Shape()

        Circle circle = new Circle(1);
        System.out.println("circle.area() = " + circle.area());
        System.out.println("circle.perimeter() = " + circle.perimeter());

        Shape shape = new Circle(5);
        System.out.println("shape.area() = " + shape.area());
        System.out.println("shape.perimeter() = " + shape.perimeter());
        System.out.println(shape.getClass());
        System.out.println(shape.getClass().getName());
        System.out.println(shape.getClass().getConstructors());
        System.out.println(shape);
        Square square = new Square(10);
        System.out.println(square);

        shape=square;
        System.out.println(shape);

        System.out.println("-------------------------");

        String str = "Golden Globe";
        int num=133;
        double num2 = 3.14;

        Object[] objectArray = {str,num,num2,animal,animal1,shape,square};
        System.out.println(Arrays.toString(objectArray));


    }

}
