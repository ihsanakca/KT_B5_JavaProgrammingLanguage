package day45_Week09_Review.animalTaskInheritanceSuper;

public class Animal {

    public String name;
    public String breed;
    public int age;
    public String size;
    public String color;

    public Animal(String name, String breed, int age,String color) {
        this(name,breed,age);
        this.color = color;
    }

    public Animal(String name, String breed, int age ) {
        this.name = name;
        this.breed = breed;
        this.age = age;

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
