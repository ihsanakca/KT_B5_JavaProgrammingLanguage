package day15_Week03_Review;

import java.util.Scanner;

public class C01_SalaryCalculator {


    public static void main(String[] args) {

        /*
        1. Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K

         */


//        double salary;
//        double taxRate;
//        double salaryAfterTax;

        double salary, taxRate, salaryAfterTax;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your salary?");

        salary = scanner.nextDouble();

        if (salary >= 130000) {
            taxRate = 0.35;
        } else if (salary >= 100000) {
            taxRate = 0.30;
        } else if (salary >= 80000) {
            taxRate = 0.25;
        } else {
            taxRate = 0.20;
        }
        //salaryAfterTax = salary - (salary * taxRate);
        salaryAfterTax = salary * (1 - taxRate);
        System.out.println("salaryAfterTax = " + salaryAfterTax);

    }

}
