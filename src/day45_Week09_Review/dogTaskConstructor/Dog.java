package day45_Week09_Review.dogTaskConstructor;

public class Dog {

    public String name;
    public String breed;
    public int age;
    public String size;
    public String color;

    public static int numberOfLegs = 4; //static variable

    public static boolean isFriendly= true;

    public Dog(String name, String breed, int age, String size, String color) {//Constructor
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public void bark() {
        System.out.println(name + " is barking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
