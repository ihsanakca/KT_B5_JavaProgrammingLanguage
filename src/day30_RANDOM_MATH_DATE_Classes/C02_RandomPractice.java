package day30_RANDOM_MATH_DATE_Classes;

import java.util.Random;

public class C02_RandomPractice {
    public static void main(String[] args) {
        // Write code that generates a random odd integer (not divisible by 2) between 50 and 99 inclusive.
                Random random = new Random();
        int value;
        while(true){
            value = random.nextInt(100-50) + 50;
            System.out.println("valueAll = " + value);
            if(value%2!=0){
                break;
            }
        }

        System.out.println("value = " + value);
    }
}
