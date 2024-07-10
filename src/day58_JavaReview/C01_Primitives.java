package day58_JavaReview;

public class C01_Primitives {

    public static void main(String[] args) {

        int length = 320;
        double VAT = 20.0;
        long population = 8_200_000_000l;
        char ch ='!';
        boolean isSmaller = length < 100;
        System.out.println("isSmaller = " + isSmaller);
        boolean isDivisibleBy2 = length%2==0;
        System.out.println("isDivisibleBy2 = " + isDivisibleBy2);

        int i = 25;
        double j = i; // implicit casting
        j=99.8;

        int k = (int)j; // explicit casting


        // var'ı unutma
    }
}
