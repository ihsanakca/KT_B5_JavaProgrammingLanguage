package day20_Week04_Review;

public class C03_DivisibleBy3Or5 {


    public static void main(String[] args) {
        System.out.println(divisible(46));
        System.out.println(divisible(45));
        System.out.println(divisible(40));
        System.out.println(divisible(42));
    }


    public static boolean divisible(int num) {
        if (num % 3 == 0 || num % 5 == 0) {
            return true;
        }
        return false;
    }
}
