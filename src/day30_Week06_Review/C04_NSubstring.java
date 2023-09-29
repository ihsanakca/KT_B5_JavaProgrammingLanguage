package day30_Week06_Review;

public class C04_NSubstring {

    String str="abc";

    public static void main(String[] args) {

//        String str= "abXYabc";
//        int n=3; //baştan kaç harfı olduğunu temsil ediyor.

        //n=1 a---> bXYabc ---> true
        //n=2 ab---> XYabc ---> true
        //n=3 abX---> Yabc ---> false
        System.out.println(checkNSubstring("abXYabc", 1));
        System.out.println(checkNSubstring("abXYabc", 2));
        System.out.println(checkNSubstring("abXYabc", 3));
        System.out.println(checkNSubstring("abXYabc", 4));
        System.out.println(checkNSubstring("abXYabc", 5));
        //System.out.println(checkNSubstring("abXYabc", 8));

    }

    public static boolean checkNSubstring(String str, int n){


        if(str.substring(n).contains(str.substring(0,n))){
            return true;
        }
        return false;
    }
}
