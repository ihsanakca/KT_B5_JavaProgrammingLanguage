package day24_StringClassCont;

public class C05_LastIndexOf {
    public static void main(String[] args) {
        //indexOf() ilk bulunanin indeksini getiriyor,
        //lastIndexOf() son bulunanin ideksini getiriyor
        String str = "Doritos";
        System.out.println(str.indexOf('p')); // -1
        System.out.println(str.indexOf('o')); // 1
        System.out.println(str.lastIndexOf('o')); //5
        System.out.println("str = " + str);
        int initialLength = str.length(); // doritos 7
        System.out.println("initialLength = " + initialLength);

        int firstIndex = str.indexOf('o');
        int lastIndex = str.lastIndexOf('o');
        if (lastIndex == firstIndex) {
            System.out.println(str.charAt(lastIndex) + " harfi bu kelimede bir adet bulunmaktadir");
        } else {
            str = str.replace("" + str.charAt(lastIndex), "");  // drits
        }
        System.out.println("str = " + str);
        System.out.println("str.length() = " + str.length());


    }
}
