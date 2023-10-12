package day39_ConstructorOverloading_Encapsulation;

public class C05_PersonObjects {
    public static void main(String[] args) {


        Person person1 = new Person();
//        System.out.println(person1);
//        person1.name="Ahmet";  //Private set()-get()

        person1.setName("Ahmet");
        System.out.println("person1.getName() = " + person1.getName());
        person1.setAge(15);
        System.out.println(person1);

        person1.setAge(-10);
        System.out.println(person1);

    }
}
