package day39_ConstructorOverloading;

import day24_StringClassCont.C06_ReverseString;
import day34_Arrays_04.C03_ReverseSentence;

public class C01_HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        for (String arg : args) {
            System.out.println(arg);
        }

        System.out.println("ilkUcHarf(args[5]) = " + ilkUcHarf(args[5]));
    }

    public static String ilkUcHarf(String str){

        if (str.length()<3){
            return str;
        }
        return str.substring(0,3);
    }
}
