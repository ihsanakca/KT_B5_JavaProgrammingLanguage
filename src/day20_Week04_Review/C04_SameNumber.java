package day20_Week04_Review;

public class C04_SameNumber {


    /*
    Create a function that returns true when x is equal to y; otherwise return false.

    Examples
    isSameNum(4, 8) ➞ false

    isSameNum(2, 2) ➞  true

    isSameNum(42, 32) ➞  false
     */


    public static void main(String[] args) {

//        System.out.println(sameNumber(5, 6));
//        System.out.println(sameNumber(7, 7));
//        System.out.println(sameNumber(-4, -4));
//        System.out.println(sameNumber(5, 96));
//        System.out.println(sameNumberTernary(8, 8));
        System.out.println(sameNumberSimple(9, 9));
        System.out.println(sameNumberSimple(9, 10));

    }

    public static boolean sameNumber(int x, int y){
        if(x==y){
            return true;
        }
        return false;
    }

    public static boolean sameNumberTernary(int x, int y){
        return x==y? true: false;

    }

    public static boolean sameNumberSimple(int x, int y){
        return x==y;

    }

}
