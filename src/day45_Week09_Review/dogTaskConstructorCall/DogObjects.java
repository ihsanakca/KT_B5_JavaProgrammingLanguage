package day45_Week09_Review.dogTaskConstructorCall;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1= new Dog("Max");
        Dog dog2= new Dog("Max","Bulldog");
        Dog dog3= new Dog("Max","Bulldog",2);
        Dog dog4= new Dog("Max","Bulldog",2,"Small");
        Dog dog5= new Dog("Max","Bulldog",2,"Small","Black");

        System.out.println("dog1 = " + dog1);
        System.out.println("dog2 = " + dog2);
        System.out.println("dog3 = " + dog3);
        System.out.println("dog4 = " + dog4);
        System.out.println("dog5 = " + dog5);




    }
}
