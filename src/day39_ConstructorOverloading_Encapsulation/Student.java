package day39_ConstructorOverloading_Encapsulation;

public class Student {
    public String name;
    public int age;
    public char gender;
    public int id;

    public Student(){
        name ="Ali Cabbar";
        age = 33;
        gender ='m';
        id=000001;
    }

    //constructor overloading
    public Student(String name, int age,char gender,int id){
//        this();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id=id;

    }

    @Override
    public String toString() {
        //this();
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                '}';
    }
}
