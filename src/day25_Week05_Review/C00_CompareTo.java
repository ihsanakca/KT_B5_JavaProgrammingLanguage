package day25_Week05_Review;

public class C00_CompareTo {
    public static void main(String[] args) {

        //sözlüksel karşılaştırma  önce ise -  eşit ise 0 sonra ise + değer döner...
        String str1 = "aba";
        String str2 = "abc";
        String str3 = "abz";
        String str4 = "abdc";
        String str5 = "abdc";
        String str6 = "abdb";


        int result1 = str1.compareTo(str2);  //-2
        int result2 = str2.compareTo(str3);  //-23
        int result3 = str3.compareTo(str4);  //22
        int result4 = str4.compareTo(str5);  //0
        int result5 = str5.compareTo(str6);  //1


        System.out.println("str1.compareTo(str2): " + result1);
        System.out.println("str2.compareTo(str3): " + result2);
        System.out.println("str3.compareTo(str4): " + result3);
        System.out.println("str4.compareTo(str5): " + result4);
        System.out.println("str5.compareTo(str6): " + result5);
    }
}
