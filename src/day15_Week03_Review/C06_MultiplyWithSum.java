package day15_Week03_Review;

import java.util.Scanner;

public class C06_MultiplyWithSum {


    public static void main(String[] args) {

        //4*3= 3+3+3+3 VEYA 4+4+4

        int result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("First Positive Number");//4

        int num1 = input.nextInt();

        System.out.println("Second Positive Number");//3

        int num2 = input.nextInt();

        if (num1 < 0 || num2 < 0) {
            System.out.println("INVALID");

        } else {
            for (int i = 1; i <= num1; i++) {
                result += num2; //re-assign
            }
            System.out.println("result = " + result);

        }


    }
}
