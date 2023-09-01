package day10_Relational_LogicalOperators_Review;

import java.util.Scanner;

public class C05_SwapVariables {

    public static void main(String[] args) {

//        int a=10, b=20;
//        int temp= a;  //temp=10;
//        a=b // a=20 b=20
//        b=temp // b=10 a=20 temp=10

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number : ");

        int a = scanner.nextInt();

        System.out.print("Enter your second number : ");
        int b = scanner.nextInt();

        System.out.println("First Number = " + a);
        System.out.println("Second Number = " + b);

        int temp= a;  // temp=firstNumber
        a=b;  // a=secondNumber b=secondNumber
        b=temp;  // b=firstNumber

        System.out.println("-----------------------------");
        System.out.println("First Number = " + a);
        System.out.println("Second Number = " + b);


    }
}

/*
write a program that can swipe two variables that the user enters by using a temporary variable
get numbers from user;

		    Ex:
		        if a= 10, b=15

		    output:
		        a = 15
		        b = 10
 */