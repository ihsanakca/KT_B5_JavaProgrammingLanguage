package day23_StringClass;

public class C02_StringIntro {
    public static void main(String[] args) {
        String str1 = "hello"; //literal way;  -> Heap Memory -->String Pool "hello" olusturur;
        String str2 = "hello"; // str2--> StringPoolda olan "hello yu " isaret ediyor
        String str3 = "Hello"; //literal way --> Heap Memory -->String Pool "Hello" olusturur;

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);

        String str4 = new String("hello"); //String Object --> Heap Memory

        System.out.println("str4 = " + str4);

        System.out.println("str1==str2 = " + (str1 == str2));   // ASLA STRINGLER == karsilastirilmaz
        System.out.println("str1==str4 = " + (str1 == str4));
        System.out.println("str1.equals(str4) = " + str1.equals(str4));

        boolean bl;
        //System.out.println(bl);  // Local degisken initilize edilmeli
        bl = str1==str2; //bl=true
        System.out.println(bl);

        bl = str1==str4; //  false cunku farkli objeler, referanslar
        System.out.println(bl);

        bl=str1.equals(str4); // referans karsilastirilmiyor, farkli obje lup olmamasi ilgilenmiyor,
                              // sadece icerik karsilastiriliyor
        System.out.println(bl);




    }
}
