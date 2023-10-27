package day50_Week10_Review.animalTaskInheritanceOverriding;

public class Animal {

    public String name;
    public String breed;
    public int age;
    public String size;
    public String color;

    public Animal(String name, String breed, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void eat(){
        System.out.println(name+ " is eating");
    }
}
