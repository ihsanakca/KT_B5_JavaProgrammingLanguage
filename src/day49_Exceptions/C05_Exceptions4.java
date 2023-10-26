package day49_Exceptions;

public class C05_Exceptions4 {
    public static void main(String[] args) {
        int i=2;    // normal statement
        int j=0;
        String str=null;

        int nums[]=new int[5];

        try{
            j = 25 / i;
            System.out.println(nums[0]);
            System.out.println(str.length());
            System.out.println(nums[5]);
        }catch(ArithmeticException e){
            System.out.println("Can not divide by 0");// ArithmeticException
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("stay in limit");
        }catch (Exception e){
            System.out.println("something went wrong"+e);
            e.printStackTrace();
        }
        System.out.println(j);


        System.out.println("Bye");
    }
}
