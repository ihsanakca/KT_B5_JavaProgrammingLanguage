package day18_CustomMethods;

import java.util.Scanner;

public class C03_MethodsWithParameters {


    public static void main(String[] args) {

        oddOrEven((int) Math.pow(2, 4));   // Math.power() methodu doubla dondugu icin manual casting yapmamiz lazim
        System.out.println("----------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen dogum yilinizi giriniz : ");
        int dogumYili = scanner.nextInt();
        ageOfPerson(dogumYili);
        System.out.println("----------------------");

        printNumbers(10, 30);


    }


    /**
     * this function checks whether a number is odd number or even number
     *
     * @param number
     */
    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }

    }

    //     a method that can display the age of the person from the birthYear

    /**
     * this method displays the age of the person from the birthYear
     *
     * @param birthYear
     */
    public static void ageOfPerson(int birthYear) {
        int age = 2023 - birthYear;
        System.out.println("Your age is " + age);
    }

    /**
     * this method prints all the numbers between minNumber and maxNumber
     *
     * @param minNumber
     * @param maxNumber
     */
    public static void printNumbers(int minNumber, int maxNumber) {
        for (int i = minNumber + 1; i < maxNumber; i++) {
            System.out.println("i = " + i);
        }
    }


}
//     a function that can check if a number is odd number or even number
//     a method that can display the age of the person from the birthYear
//     a method that can print all the numbers between X and Y
