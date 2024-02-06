package day23_StringClass;

public class C04_StringPool {
    public static void main(String[] args) {
        //Literal
        String str1 = "Ahmet";
        String str2 = "Ahmet";
        String str3 = "Mehmet";

        System.out.println("System.identityHashCode(str) = " + System.identityHashCode(str1));
        System.out.println("System.identityHashCode(str2) = " + System.identityHashCode(str2));
        System.out.println("System.identityHashCode(str3) = " + System.identityHashCode(str3));

        //new Keyword
        String str4 = new String("Ahmet");
        String str5 = new String("Ahmet");

        System.out.println("System.identityHashCode(str4) = " + System.identityHashCode(str4));
        System.out.println("System.identityHashCode(str5) = " + System.identityHashCode(str5));

        str5 = str5.intern();

        System.out.println("System.identityHashCode(str5) = " + System.identityHashCode(str5));

        System.out.println(str1 == str2);
        System.out.println(str1 == str4);
        System.out.println(str2 == str5);

    }
}
