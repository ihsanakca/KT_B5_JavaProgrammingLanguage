package day45_Week09_Review.animalTaskInheritanceSuper;

public class Dog extends Animal {

    public boolean isBarking;
    public Dog(String name, String breed, int age,String color,boolean isBarking) {
        super(name, breed, age,color);
        this.isBarking= isBarking;
    }




    //Dog is an animal--->Inheritance
// Dog: child/sub class  Animal: parent/super class

    public void bark(){
        System.out.println(name+ " is barking");
    }

}
