package day58_JavaReview;

public class C08_MethodOverloading {

    public static void main(String[] args) {

        String str = "KraftTech";
        printEach(str);
        System.out.println("-----------------");

        int[] numbers = {5,10,15,20,25,30};
        printEach(numbers);

        System.out.println("-----------------");
        char[] hollyNameChars = "Muhammed".toCharArray();

        printEach(hollyNameChars);




    }

    public static void printEach(String str){
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));
        }

    }

    public static void printEach(String[] arr){
        for (String each : arr) {
            System.out.println(each);
        }
    }

    public static void printEach(int[] arr){
        for (int each : arr) {
            System.out.println(each);
        }
    }

    public static void printEach(char[] arr){
        for (char each : arr) {
            System.out.println(each);
        }
    }

    public static void printEach(double[] arr){
        for (double each : arr) {
            System.out.println(each);
        }
    }

}
