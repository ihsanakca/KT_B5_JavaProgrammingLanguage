package day19_ReturnMethods_Overloading;

import java.util.Scanner;

public class C01_MethodTasks {
    public static void main(String[] args) {
        double paraustu = 0;
        double ayakkabiUcreti = 250;

        paraustu = dollarToTL(10) - ayakkabiUcreti;
        System.out.println(paraustu);

        System.out.println("-------------------------");

        System.out.println("kgToLb(23) = " + kgToLb(23));

        System.out.println("-------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scanner.nextInt();
        signOfNumber(num);


    }

//    public static void dollarToTL(int dollarAmount){
//        System.out.println(dollarAmount*26.95);
//    }

    /**
     * This method converts dollar to TL
     *
     * @param dollarAmount
     * @return
     */
    public static double dollarToTL(int dollarAmount) {

        return dollarAmount * 26.95;
    }

    //	2. create a method that can convert kg to lb 2.2
    // 5kg  6*2.2 = 13.2

    /**
     * This method converts kg to lb
     *
     * @param kg
     * @return
     */
    public static double kgToLb(double kg) {
        double lb = kg * 2.2;
        return lb;
    }

//    create a method that can determine if the given integer is positive, negative or zero

    /**
     * this method determines if the given integer is positive, negative or zero
     *
     * @param number
     */
    public static void signOfNumber(int number) {
        if (number > 0) {
            System.out.println(number + " is a positive number");
        } else if (number < 0) {
            System.out.println(number + " is a negative number");
        } else {
            System.out.println(number + " is zero");
        }
    }


}
//create a method that can convert dollar to TL rate:26.85
//2. create a method that can convert kg to lb 2.2
//	3. create a method that can determine if the given integer is positive, negative or zero
