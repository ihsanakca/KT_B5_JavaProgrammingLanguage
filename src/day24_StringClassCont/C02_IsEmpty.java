package day24_StringClassCont;

public class C02_IsEmpty {
    public static void main(String[] args) {
        String str1 = "Merhaba";
        System.out.println("str1.isEmpty() = " + str1.isEmpty());
        System.out.println("str1.isBlank() = " + str1.isBlank());

        str1="";
        System.out.println("str1.isEmpty() = " + str1.isEmpty());
        System.out.println("str1.isBlank() = " + str1.isBlank());

        str1=" ";
        System.out.println("str1.isEmpty() = " + str1.isEmpty());
        System.out.println("str1.isBlank() = " + str1.isBlank());
    }
}
