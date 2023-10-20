package day45_Week09_Review.animalTaskInheritance;

public class Animal {

    public String name;
    public String breed;
    public int age;
    public String size;
    public String color;

    public void setInfo(String name, String breed, int age, String size, String color) {
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
