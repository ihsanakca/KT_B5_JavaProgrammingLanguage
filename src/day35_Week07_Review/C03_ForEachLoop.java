package day35_Week07_Review;

public class C03_ForEachLoop {

    public static void main(String[] args) {

        //For each loop: Data Structure: Array- Collections -Map

        int[] num1 = {5, 78, 46, 42};

        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i]+" ");


        }
        System.out.println();

        for (int a : num1) {
            System.out.print(a+" ");
        }


    }
}
