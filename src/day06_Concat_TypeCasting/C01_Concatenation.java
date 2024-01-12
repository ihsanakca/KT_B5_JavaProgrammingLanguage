package day06_Concat_TypeCasting;

public class C01_Concatenation {
     public static void main(String[] args){

         String str1 = null;   // declaration
         String str2=""; // declaration and assignment

       //  System.out.println(str2);

        // System.out.println(str1);


         String a="Merhaba";
         String b="Dünya";  // hem decleration hemde assingment
         String c=a+" "+b;
         System.out.println(c);
         int i=10;

         System.out.println(c+" bugün nasılsın.");
         System.out.println(i+3+8+a+(2+5)+7+"dünya");
            // 2+(5-3)*4+6
         //    2+2*4+6
         //    2+8+6
         //   16


         int x=10;
         int y=20;
         String str="";// empty string  --- null değildir.
         System.out.println(x+str+y);


     }
}
