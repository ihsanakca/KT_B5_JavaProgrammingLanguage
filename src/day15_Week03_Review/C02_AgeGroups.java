package day15_Week03_Review;

import java.util.Scanner;

public class C02_AgeGroups {


    public static void main(String[] args) {

//        Write a program that can define the age groups of a person
//        age groups are:
//        Teenager (< 21)
//        Adult   (>=21 && <55 )
//        Senior  ( >= 55 )
//
//        if age is negative or greater than 150, print invalid

        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age?");

        age = scanner.nextInt();

        //1.VALID
        //1.1
        //1.2
        //1.3
        //2.INVALID

        if (age > 0 && age < 150) {
            if (age < 21) {
                System.out.println("Teenager");
            } else if (age < 55) {
                System.out.println("Adult");
            } else {
                System.out.println("Senior");
            }
        } else {


            System.out.println("INVALID");

        }
    }
}

