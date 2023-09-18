package day21_Class_And_Methods;


import java.util.Random;

public class C01_MethodSummary {
    public static void main(String[] args) {

        System.out.println("evenOrOdd() = " + evenOrOdd());
        String s = evenOrOdd();

        System.out.println("max(23,45) = " + max(23, 45));
        int result = max(21, 12)*2;
        System.out.println("result = " + result);
    }


    public static String evenOrOdd(){
        Random random=new Random();
        int x=random.nextInt(100);
        System.out.println("x = " + x);
        if (x%2==0){
            return "true";
        }
        return "false";

    }


    public static int max(int x, int y){
        int max;
        if (x>y){
            max=x;
        }else{
            max=y;
        }
        return  max;

    }

    public static int max2(int x, int y){

        if (x>y){
            return x;
        }else {
            return y;
        }
    }


}
