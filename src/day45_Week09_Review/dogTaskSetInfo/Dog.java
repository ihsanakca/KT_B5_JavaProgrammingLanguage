package day45_Week09_Review.dogTaskSetInfo;

public class Dog {

        public String name;
        public String breed;
        public int age;
        public String size;
        public String color;


        public void setInfo(String dogName, String dogBreed, int dogAge, String dogSize, String dogColor){
            name= dogName;
            breed= dogBreed;
            age= dogAge;
            size= dogSize;
            color= dogColor;
        }

        public void bark(){
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
