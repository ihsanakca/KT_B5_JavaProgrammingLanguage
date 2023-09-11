package day15_Week03_Review;

import java.util.Scanner;

public class C07_SumOfPositiveNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        int i = 1;

        while (i<5) {
            System.out.println("Bir sayı giriniz:");
            int num = input.nextInt();
            if (num < 0) {
                break;
            }
            i++;
            sum += num;
            System.out.println("sum = " + sum);
        }
        //System.out.println("sum = " + sum);


    }


}
