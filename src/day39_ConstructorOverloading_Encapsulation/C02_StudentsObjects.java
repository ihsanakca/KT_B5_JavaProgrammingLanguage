package day39_ConstructorOverloading_Encapsulation;

public class C02_StudentsObjects {
    public static void main(String[] args) {

        Student s1 = new Student();
        System.out.println(s1);
        s1.age = 25;
        s1.id=123456;
        s1.gender='m';
        s1.name ="Osman";
        System.out.println(s1);

        Student s2 = new Student("Ayse",25,'f',123456);

    }
}
