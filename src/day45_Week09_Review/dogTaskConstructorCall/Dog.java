package day45_Week09_Review.dogTaskConstructorCall;

public class Dog {

    public String name;
    public String breed;
    public int age;
    public String size;
    public String color;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, String breed) {
        this(name); // calling first constructor
        this.breed = breed;
    }

    public Dog(String name, String breed, int age) {
        this(name,breed);
        this.age = age;
    }

    public Dog(String name, String breed, int age, String size) {
        this(name,breed,age);
        this.size = size;
    }

    public Dog(String name, String breed, int age, String size, String color) {
        this(name,breed,age,size);
        this.color = color;
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
