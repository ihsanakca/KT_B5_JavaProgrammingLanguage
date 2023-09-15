package day20_Week04_Review;

public class C01_HelloName {

    /*
        Create a method that Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
         */

    public static void main(String[] args) {

        String msg = helloName("Good morning", "Bob",34);
        System.out.println(msg);
        //System.out.println(helloName(14, "Ali"));
        helloName2("Ayşe");

    }

    public static String helloName(String greetings, String name, int num) {
        String message = greetings+" " + name +" "+ num+"!";
        return message;
    }

    public static void helloName2(String name) {
        System.out.println("Hello " + name + "!");

    }

}
