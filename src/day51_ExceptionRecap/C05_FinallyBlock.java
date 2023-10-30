package day51_ExceptionRecap;

public class C05_FinallyBlock {

    public static void main(String[] args) {

        int[] arr={5,7,8};

        try {
            System.out.println(arr[6]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Catch");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally Block");
        }

    }




}
