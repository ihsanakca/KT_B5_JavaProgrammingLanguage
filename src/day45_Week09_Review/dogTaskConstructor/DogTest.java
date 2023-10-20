package day45_Week09_Review.dogTaskConstructor;

public class DogTest {
    public static void main(String[] args) {

        Dog dog1= new Dog("Lucy","Husky",3,"small","white");

        //Dog dog2= new Dog("Max");

        System.out.println("Dog.numberOfLegs = " + Dog.numberOfLegs);

        dog1.name="Max";

        System.out.println("dog1 = " + dog1);

        System.out.println("dog1.numberOfLegs = " + dog1.numberOfLegs);

        System.out.println(Dog.isFriendly);


    }
}
