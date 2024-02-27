package day37_ArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_Summary {
    public static void main(String[] args) {
        boolean digit = Character.isDigit(Integer.toString(1001).split("")[0].charAt(0));
        System.out.println("digit = " + digit);

        Integer inW=10;
        int inP=5;
        inP=inW;//     unboxing
        inW=inP; // autoboxing

        String s="5";
        Integer k = Integer.valueOf(s);
        int x = Integer.parseInt(s);

        int [] arr=new int[10];
        arr[0]=5; // 5,0,0,0,0,0,0,0,0,0


        System.out.println(nameControl("  Yusuf Yıl/dız"));
        String text="asa0s1sdda12sa0sda1,210,as56sdada,ghf312fdg,/;";
        System.out.println("Arrays.toString(numberInText(text)) = " + Arrays.toString(numberInText(text)));

    }



    public static int [] numberInText(String str){
        // asa0s1sdda12sa0sda1,210,as56sdada,ghf312fdg,////

        String result="";// "1120121056312"
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                result+=str.charAt(i);
            }
        }

        // "1", "1", "2", "0", "1", "2", 1056312
        String [] arr=result.split("");
        int [] arrNew=new int[arr.length];
        for (int i = 0; i < arrNew.length; i++) {
            arrNew[i]=Integer.parseInt(arr[i]);
        }

        return arrNew;



    }



    public static boolean nameControl(String str){

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) || !Character.isLetter(str.charAt(i)) ){
                if (str.charAt(i)==' '){
                    continue;
                }

                return false;
            }
        }
     return true;
    }

}
