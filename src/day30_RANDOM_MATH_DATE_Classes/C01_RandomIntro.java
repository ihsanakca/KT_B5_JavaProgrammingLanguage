package day30_RANDOM_MATH_DATE_Classes;

import java.util.Random;

public class C01_RandomIntro {
    public static void main(String[] args) {
        System.out.println("Math.pow(2,3) = " + Math.pow(2, 3));

       // Math math = new Math();  obje üretemeyiz... çünkü private tutulmuş...

        Random randomNumber = new Random();
       int result = randomNumber.nextInt(50)+50;
        System.out.println("result = " + result);
        for (int i = 0; i < 1000; i++) {
            System.out.println(randomNumber.nextInt(11)+5);

            System.out.println(randomNumber.nextInt());
            System.out.println(randomNumber.nextDouble());
            System.out.println(randomNumber.nextFloat());
            System.out.println(randomNumber.nextBoolean());
            System.out.println(randomNumber.nextInt(10)); // 0 - 9 int random numbers
            System.out.println(randomNumber.nextInt(1)); // only 0 (max-1)
            System.out.println(randomNumber.nextInt(10) + 5); // 5 - 14 int random numbers
            System.out.println(randomNumber.nextInt(1) + 3); // only 3
            System.out.println(randomNumber.nextInt(2) + 1); // 1 or 2
            System.out.println(randomNumber.nextInt(100) - 50); // -50 ==> 49 int random numbers
            int sayi = randomNumber.nextInt(10) + 5;
            System.out.println("sayi = " + sayi);
        }

    }
}
