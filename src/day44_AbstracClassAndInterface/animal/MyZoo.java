package day44_AbstracClassAndInterface.animal;

public class MyZoo {
    public static void main(String[] args) {
//        Animal animal = new Animal("Monkey","Mammal",'m',15,"Large","Black");
//        Cannot create objects from abstract classes

//        CanFly canFly = new CanFly(); interface
//        Cannot create objects from interfaces

        Cat cat = new Cat("Bulut","Scottish",'m',4,"Medium","Gray");
        System.out.println(cat);
        cat.eat();
        cat.play();
        cat.meow();
        cat.setAge(5);
        System.out.println(cat);
        cat.drinkWater();

        Dog dog = new Dog("Karabas","Malakli",'m',7,"Large","Black and White");
        System.out.println(dog.getAge());
        dog.bark();
        dog.drinkWater();
        dog.play();
        dog.setName("Akbas");
        System.out.println(dog);


    }
}
