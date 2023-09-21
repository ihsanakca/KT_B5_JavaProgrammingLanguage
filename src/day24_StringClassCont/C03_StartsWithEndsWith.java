package day24_StringClassCont;

public class C03_StartsWithEndsWith {
    public static void main(String[] args) {

        String str ="Hersey cok guzel";
        System.out.println("str.startsWith(\"H\") = " + str.startsWith("H"));
        System.out.println("str.startsWith(\"h\") = " + str.startsWith("h"));
        System.out.println("str.startsWith('H') = " + str.startsWith(""+'H'));
        System.out.println(str.startsWith("Her"));
        System.out.println(str.startsWith("Hers"));
        System.out.println(str.startsWith("Herse"));
        System.out.println(str.startsWith("Her sey"));
        System.out.println(str.startsWith(str));
        System.out.println(str.startsWith(""));  //true
        System.out.println(str.startsWith(" ")); //false

        System.out.println("str.endsWith(str) = " + str.endsWith(str));
        System.out.println(str.endsWith("ersey cok guzel"));
        System.out.println(str.endsWith("sey cok guzel"));
        System.out.println(str.endsWith("  cok guzel"));
        System.out.println(str.endsWith("ok guzel"));
        System.out.println(str.endsWith("k  guzel"));
        System.out.println(str.endsWith("guzel"));
        System.out.println(str.endsWith("uzel"));
        System.out.println(str.endsWith("Guzel"));
        System.out.println(str.endsWith("uz el"));
        System.out.println(str.endsWith("l"));
        System.out.println(str.endsWith(""));

    }
}
