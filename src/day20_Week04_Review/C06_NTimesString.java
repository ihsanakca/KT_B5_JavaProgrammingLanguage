package day20_Week04_Review;

public class C06_NTimesString {

    /*
        Given a string and a positive int n, return a string that is n copies of the original string.


stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
         */

    public static void main(String[] args) {

//        System.out.println("stringNTimes(\"Ankara\",5) = " + stringNTimes("Ankara ", 5));

        //System.out.println("stringTimes(\"Hi\",3) = " + stringTimes("Hi", 7));
        //stringTimes("Hi",3);
        String newResult = stringNTimes("Hisse",5);
        System.out.println(newResult);
        newResult= newResult.substring(0,4);
        System.out.println(newResult);

    }


    public static String stringNTimes(String str, int n){
        String result="";
        for (int i = 0; i < n ; i++) {
            result = result + str;
        }
        return result;
    }
    public static void stringTimes(String str, int n){

        for (int i = 0; i < n ; i++) {
            System.out.print(str);

        }
    }
}
