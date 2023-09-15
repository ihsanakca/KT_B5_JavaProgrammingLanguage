package day20_Week04_Review;

public class C05_DoubleTheSum {

    public static void main(String[] args) {
        //System.out.println(doubleSum(5, 5));
        int result = doubleSum(7, 7);
        System.out.println("result = " + result);

    }


    public static int doubleSum(int a, int b) {
        int sum;
        if (a == b) {

            sum = 2 * (a + b);
        } else {
            sum = a + b;

        }
        return sum;
    }
}
