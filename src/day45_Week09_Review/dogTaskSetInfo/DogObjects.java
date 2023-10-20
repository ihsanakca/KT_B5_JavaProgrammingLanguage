package day45_Week09_Review.dogTaskSetInfo;

import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1= new Dog();

        System.out.println("dog1 = " + dog1);


        dog1.name= "Max";
        dog1.age=2;
        dog1.size= "small";
        dog1.color="brown";
        dog1.breed="bulldog";

        System.out.println("dog1 = " + dog1);


        System.out.println("------------setInfo Method----------------------------");

        Dog dog2= new Dog();


        dog2.setInfo("Max","Bulldog",3,"Big","Black");

        System.out.println("dog2 = " + dog2);

        dog2.bark();

        Dog[] dogs= {dog1,dog2};
        System.out.println("Arrays.toString(dogs) = " + Arrays.toString(dogs));
        System.out.println("dogs[0] = " + dogs[0]);//dog1
        int[] arr={2,4};


    }
}
