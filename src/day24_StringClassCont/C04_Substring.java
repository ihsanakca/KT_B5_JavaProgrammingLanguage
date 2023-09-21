package day24_StringClassCont;

public class C04_Substring {
    public static void main(String[] args) {
        String str ="iki tane Bounty, bir tane Snickers";
        //           0123456789012345678901234567890123
        System.out.println(str.length());

        System.out.println(str.substring(0, 15)); //iki tane Bounty
        System.out.println(str);

        System.out.println(str.substring(17)); //bir tane Snickers
        System.out.println(str.substring(17,33)); //bir tane Snickers
        System.out.println(str.substring(17,34)); //bir tane Snickers
        System.out.println(str.substring(17)); //bir tane Snickers

        System.out.println(str.substring(str.length() - 8));
        System.out.println(str.substring(str.length() - 4));
        System.out.println(str.substring(0));
        //son harf
        System.out.println(str.substring(str.length() - 1));
        System.out.println(str.substring((str.length() - 1),str.length()));

        //ilkharf
        System.out.println(str.substring(0, 1));
        System.out.println(str.substring(5, 3)); // runtime error


    }
}
