package day14_NestedWhileDoWhileLoops;

import java.util.Scanner;

public class C03_MaxNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max=Integer.MIN_VALUE;


        for (int j=1; j<=5; j++){
            System.out.println("Enter a number:");
            int num=scan.nextInt();
            if(num>max){
                max=num;
            }
            System.out.println("max = " + max);
        }




    }




}
/*
Write a program that asks the user to enter a number for 5 times.
return the Maximum number
 */