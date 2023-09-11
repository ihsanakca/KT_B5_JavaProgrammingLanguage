package day15_Week03_Review;

import java.util.Scanner;

public class C05_SumOfAnyNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int num = scanner.nextInt();


        int sum = 0;

        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {
                sum += i;
            }

        }
        System.out.println("sum = " + sum);
    }


}

