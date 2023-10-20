package day45_Week09_Review.dogTaskEncapsulation;



public class DogObjects {

    public static void main(String[] args) {

        Dog dog1= new Dog("Max","Bulldog",2,"Small","Black");

        System.out.println("dog1 = " + dog1);

        dog1.setColor("white");

        dog1.setAge(-1);

        dog1.setName(" ");

        System.out.println("dog1 = " + dog1);


    }
}
