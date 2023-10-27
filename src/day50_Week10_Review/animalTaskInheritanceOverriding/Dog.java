package day50_Week10_Review.animalTaskInheritanceOverriding;

public class Dog extends Animal {

    public boolean isBarking;

    public Dog(String name, String breed, int age, String size,String color, boolean isBarking) {
        super(name, breed, age, size, color);
        this.isBarking = isBarking;
    }


    //Dog is an animal--->Inheritance
// Dog: child/sub class  Animal: parent/super class

    public void bark() {
        System.out.println(name + " is barking");
    }
    @Override
    public void eat(){
        System.out.println(name+ " is eating dog food");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "isBarking=" + isBarking +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
