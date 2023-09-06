package day13_ForLoops;

import java.util.Scanner;

public class C03_NegativePositiveTernary {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        int n = scanner.nextInt();

        if (n > 0)
            System.out.println("Positive Number");
        else if (n<0)
            System.out.println("Negative Number");
        else
            System.out.println("Zero");

        System.out.println("---------------------------------");

        String result = n>0 ? "Positive Number":   ( n<0 ? "Negative Number" : "Zero") ;
        System.out.println("result = " + result);


    }
}
