package day50_Week10_Review.animalTaskPolymorphism;

public abstract class Animal {

    private String name;

    private final String breed;

    private int age;

    private String size;

    private final String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public Animal(String name, String breed, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public abstract void eat();

    public void drink(){
        System.out.println(name+ " is drinking water");
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
}



