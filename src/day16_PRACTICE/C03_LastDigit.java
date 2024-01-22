package day16_PRACTICE;

public class C03_LastDigit {
    public static void main(String[] args) {
//        Given two non-negative int values, return true if they have
//        the same last digit, such as with 27 and 57.
//        Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
//
//
//        lastDigit(7, 17) → true
//        lastDigit(6, 17) → false
//        lastDigit(3, 113) → true

        int a = 2;
        int b = 100;

        boolean isEqual=true;

        isEqual = a % 10 == b % 10 ? true : false;

        System.out.println("isEqual = " + isEqual);
    }
}
