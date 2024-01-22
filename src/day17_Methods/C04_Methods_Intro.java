package day17_Methods;

public class C04_Methods_Intro {

    public static void main(String[] args) {

        String name="Ahmet";
        name=name.toUpperCase();
        System.out.println("name = " + name);
        sayHi();
        System.out.println("Program başladı");
        sayHi();
        System.out.println("Program bitti");
        sayBye();
    }


    public static void sayHi(){
        System.out.println("Hi");
        String name="Ali";
        name=name.toLowerCase();
        System.out.println("name = " + name);
    }


    public static void sayBye(){
        System.out.println("Bye");
    }

}
