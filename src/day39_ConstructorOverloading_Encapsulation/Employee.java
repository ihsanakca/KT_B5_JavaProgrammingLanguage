package day39_ConstructorOverloading_Encapsulation;

public class Employee {
    private String name;

    private char gender ;

    private int age;

    private double salary;


    public Employee(String name, char gender, int age, double salary){
//        this.name=name;
        setName(name);
//        this.gender=gender;
        setGender(gender);
//        this.age=age;
        setAge(age);
//        this.salary=salary;
        setSalary(salary);
    }

    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }

    public double getSalary(){
        return salary;
    }

    public void setName(String name){
        if(name.isEmpty()|| name.isBlank()){
            System.err.println("Please enter a valid name");
            return;
        }
        this.name=name;
    }

    public void setGender(char gender){
        if(!(gender =='M' || gender =='m' ||gender =='F' || gender =='f')){
            System.err.println("Please enter a valid gender m, M, f, F,");
            return;
        }


        this.gender = gender;
    }

    public void setAge(int age){
        if(age<16 || age>90){
            return;
        }
        this.age= age;
    }

    public void setSalary(double salary){
        if(salary<0){
            return;
        }
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
