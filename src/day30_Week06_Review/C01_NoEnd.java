package day30_Week06_Review;

public class C01_NoEnd {

    public static void main(String[] args) {


        System.out.println(noEnd("armut"));


    }

    public static String noEnd(String str){

        // armut ---> armu

        return str.substring(0, str.length()-1);




    }
}
