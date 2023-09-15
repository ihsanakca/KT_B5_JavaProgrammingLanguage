package day20_Week04_Review;

public class C02_Between30And40 {
    /*
    Create a method that returns true, if Given 2 int values are both in the range 30..40 inclusive
    Verilen 2 int değerinin her ikisi de 30 ile 40 (dahil) aralığında ise true değerini döndüren bir metot yazın

in3040(30, 31) → true
in3040(30, 41) → false

     */
    public static void main(String[] args) {

        System.out.println(between30_40(34, 40));
        System.out.println(between30_40(25, 40));
        System.out.println(between30_40(30, 15));
        System.out.println(between30_40(11, 56));

        boolean number = between30_40(12, 56);



    }

    public static boolean between30_40(int a, int b){
        if(a>=30 && a<=40 && b>=30 && b<=40 ){
            return true;
        }
        return false;
    }
}
