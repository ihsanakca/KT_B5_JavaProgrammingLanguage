package day45_Week09_Review.animalTaskInheritance;

public class Zoo {

    public static void main(String[] args) {

        Dog dog1= new Dog();

        dog1.setInfo("Max","Husky",2,"Big","Brown");

        System.out.println(dog1);

        dog1.eat();
        dog1.bark();

        Cat cat1= new Cat();

        cat1.setInfo("Pamuk","Van kedisi",3,"Small","White");

        System.out.println("cat1 = " + cat1);

        cat1.eat();
        //cat1.bark();

        Tiger tiger1= new Tiger();

        tiger1.roar();



    }
}
