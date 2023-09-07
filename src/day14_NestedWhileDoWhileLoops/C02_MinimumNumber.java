package day14_NestedWhileDoWhileLoops;

import java.util.Scanner;

public class C02_MinimumNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        System.out.println(min);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number");
            int num = scanner.nextInt();
            if (num < min){
                min=num;
            };
        }

        System.out.println("min = " + min);




    }

}
       /*
Write a program that asks the user to enter a number for 5 times.
return the Minumun number
 */