package day50_Week10_Review.animalTaskInheritanceOverriding;

public class Zoo {

    public static void main(String[] args) {

        //Animal animal1= new Animal("Lessie","Husky", 2, "Small", "White");

        Dog dog1= new Dog("Lessie","Husky", 2, "Small", "White",true);

        dog1.bark();

        dog1.eat();

        System.out.println(dog1);

    }
}
