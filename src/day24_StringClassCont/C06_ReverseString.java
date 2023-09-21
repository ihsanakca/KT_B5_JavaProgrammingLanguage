package day24_StringClassCont;

public class C06_ReverseString {
    public static void main(String[] args) {

        String str = "EY EDIP ADANADA PIDE YE!"; //34
        //            0                                3
        String reversed="";

        for (int i = str.length()-1; 0<=i ; i--) {
            reversed +=str.charAt(i);
        }

        System.out.println("str = " + str);
        System.out.println("reversed = " + reversed);


    }

}
