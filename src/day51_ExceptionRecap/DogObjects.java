package day51_ExceptionRecap;


import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1= new Dog("Lessie","Husky", 2, "Small", "White");
        Dog dog2= new Dog("Lily","Husky", 5, "small", "Black");
        Dog dog3= new Dog("Karabaş","Bulldog", 3, "large", "White");
        Dog dog4= new Dog("Lucy","Husky", 1, "large", "White");
        Dog dog5= new Dog("Panter","Labrador", 4, "Large", "White");
        Dog dog6= new Dog("Ace","Husky", 2, "small", "Brown");
        Dog dog7= new Dog("K9","Pit-bull", 3, "large", "White");
        Dog dog8= new Dog("Jack","Husky", 1, "Small", "white");


        ArrayList<Dog> dogList= new ArrayList<>();
        dogList.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5,dog6,dog7,dog8));

        System.out.println(dogList);

        //dogList.removeIf(dog-> dog.age!=1);

        //dogList.removeIf(dog->dog.name.startsWith("L")&& dog.size.equalsIgnoreCase("small"));

        dogList.removeIf(dog->dog.age>3 || dog.color.equalsIgnoreCase("brown"));

        System.out.println(dogList);
        System.out.println("dogList.size() = " + dogList.size());


    }
}
