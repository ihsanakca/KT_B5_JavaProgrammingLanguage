package day38_Constructors;

public class C04_PersonObjects {
    public static void main(String[] args) {
        Person person1 = new Person("Atakan",'m',25);
        System.out.println("person1.name = " + person1.name);
        System.out.println("person1.age = " + person1.age);
        System.out.println("person1.gender = " + person1.gender);

        person1.age=35;
        System.out.println(person1);
        Person person2 = new Person();
        person2.gender='f';
        person2.name="Ayse";
        person2.age=30;
        System.out.println(person2);
        person2.name="bulent";
        System.out.println(person2);
        person2.gender='m';
        System.out.println(person2);

//
//        person1.name="Atakan";
//        person1.gender='m';
//        person1.age=25;





    }
}
