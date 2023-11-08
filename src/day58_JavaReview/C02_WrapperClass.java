package day58_JavaReview;

public class C02_WrapperClass {
    public static void main(String[] args) {

        int x= 130;
        byte y = 33;
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);

        //x = y;
        y =(byte) x; // 128*4 = 512
        System.out.println("y = " + y);

        Integer z = x;
        //z = y; // Integer byte
        System.out.println(z);
        //Wrapper class uses it own datatype

        char ch = '#';
        Character ch1 =ch;

        System.out.println("-------------------------------------------");
        String idNum= "1551994545";
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        int myId = Integer.parseInt(idNum);
        System.out.println(myId+5);

        Integer myIdObj = Integer.valueOf(idNum);
        System.out.println("myIdObj = " + myIdObj);

        System.out.println("Integer.max(9,19) = " + Integer.max(9, 19));
        System.out.println("Integer.min(9,19) = " + Integer.min(9, 19));
        System.out.println("Integer.max(Integer.parseInt(idNum)+5,Integer.valueOf(idNum)) = " + Integer.max(Integer.parseInt(idNum)+5, Integer.valueOf(idNum)));

        System.out.println("-------------------------------------");

        System.out.println("Character.isDigit(ch) = " + Character.isDigit(ch));
        System.out.println("Character.isLowerCase(ch) = " + Character.isLowerCase(ch));
        System.out.println("Character.isLetterOrDigit(ch) = " + Character.isLetterOrDigit(ch));
        System.out.println("Character.isLetterOrDigit(A) = " + Character.isLetterOrDigit('A'));


    }
}
