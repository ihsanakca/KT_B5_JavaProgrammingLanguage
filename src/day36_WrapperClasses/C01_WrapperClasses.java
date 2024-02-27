package day36_WrapperClasses;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        int x=5;
      // Integer y=new Integer(10);
        Integer y=5;
        String str="Merhaba";

        System.out.println(y);
        System.out.println(y+x);


        // x. method vermez ancak y. bize Integer classına ait methodları verir

        System.out.println(x==y);
        // normal şartlarda y referans tutmsı gerekir ama wrapper classlarda bu böyle olmaz
        // int ile yapabileceğimiz herşeyi wrapper ile de yapabiliriz


        char c='e';
        Character cW='e';
        System.out.println("Character.isLetter(\"!\") = " + Character.isLetter('!'));
        System.out.println("Character.isDigit('A') = " + Character.isDigit('A'));
        System.out.println("Integer.max(50,60) = " + Integer.max(50, 60));
        System.out.println("Double.max(34,23) = " + Double.max(34.9, 23.9));
        System.out.println("Double.sum(23,34) = " + Double.sum(23, 34));

      //  Short s=new Short((short) 100);
        Short s= 100;
     //   Byte b=new Byte((byte) 111);


        Integer sayiW=10;
        int sayiP=20;

        sayiP=sayiW.intValue();  // unboxing
        sayiP=sayiW;  // auto-unboxing yaptı -- wrapper i int e attık
        sayiW=sayiP; // auto boxing

    }
}
