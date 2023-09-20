package day23_StringClass;

public class C03_StringMethods {
    public static void main(String[] args) {
        String programmingLanguage = "Java"; // String pool icersinde bir obje olusturdu
        System.out.println("programmingLanguage.length() = " + programmingLanguage.length());

        programmingLanguage="Phyton";       //  String pool icersinde bir obje olusturdu, string immutable
        System.out.println("programmingLanguage.length() = " + programmingLanguage.length());


        System.out.println("---------------------------------");
        //toLowerCase(), toUpperCase()
        System.out.println(programmingLanguage.toLowerCase());
        System.out.println(programmingLanguage.toUpperCase());
        System.out.println("programmingLanguage = " + programmingLanguage);
        programmingLanguage = programmingLanguage.toUpperCase(); //PHYTON
        System.out.println("programmingLanguage = " + programmingLanguage);

        System.out.println("==================================");

        //charAt() programmingLanguage = PHYTON
        //                               012345
        //System.out.println(programmingLanguage.charAt(6)); // runtime error - String index out of range: 6

        System.out.println("programmingLanguage.charAt(3) = " + programmingLanguage.charAt(3));
        System.out.println("programmingLanguage.charAt(5) = " + programmingLanguage.charAt(5));
        System.out.println("programmingLanguage.charAt(programmingLanguage.length()-1) = " + programmingLanguage.charAt(programmingLanguage.length() - 1));

        //System.out.println("programmingLanguage.charAt(-1) = " + programmingLanguage.charAt(programmingLanguage.length()-8));


        System.out.println("--------------------------------");
        //concat()
        System.out.println(programmingLanguage + " programming Language");
        System.out.println(programmingLanguage.concat(" programming Language"));
        String lang = "programming language";
        System.out.println("programmingLanguage.concat(lang) = " + programmingLanguage.concat(" "+lang));

        System.out.println("---------------------------------");
        //contains()  // boolean deger doner
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("programmingLanguage.contains(\"HY\") = " + programmingLanguage.contains("HY"));
        System.out.println("programmingLanguage.contains(\"YH\") = " + programmingLanguage.contains("YH"));
        System.out.println("programmingLanguage.contains(\"h\") = " + programmingLanguage.contains("h"));
        programmingLanguage = "    Java Programming Language    ";
        System.out.println("programmingLanguage.contains(\"java\") = " + programmingLanguage.contains("java"));
        System.out.println("programmingLanguage.contains(\"a Pr\") = " + programmingLanguage.contains("a Pr"));

        System.out.println("----------------------------------");
        //trim()

        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("programmingLanguage.trim() = " + programmingLanguage.trim());
        System.out.println("programmingLanguage = " + programmingLanguage);

        System.out.println("----------------------------------");
        //replace()

        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("programmingLanguage.replace(\" \",\"\") = " + programmingLanguage.replace(" ", ""));
        System.out.println("programmingLanguage = " + programmingLanguage);
        programmingLanguage = programmingLanguage.replace(" ","");
        System.out.println("programmingLanguage = " + programmingLanguage);

        System.out.println("programmingLanguage.replace(\"Java\",\"phyton\") = " + programmingLanguage.replace("Java", "phyton"));
        System.out.println("--------------------------------");
        //indexOf(), lastIndexOf()

        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("programmingLanguage.indexOf('a') = " + programmingLanguage.indexOf('a'));
        System.out.println("programmingLanguage.indexOf(\"Programming\") = " + programmingLanguage.indexOf("Programming"));
        System.out.println("programmingLanguage.lastIndexOf('a') = " + programmingLanguage.lastIndexOf('a'));

        //equals()
        String str1= "hello";
        String str2= "Hello";
        String str3 = new String("Hello");
        String str4 = new String("HELLO");

        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        System.out.println("str1.equals(str3) = " + str1.equals(str3));
        System.out.println("str2.equals(str3) = " + str2.equals(str3));

        System.out.println("---------------------------------");

        //equalsIgnoreCase()
        System.out.println("str1.equalsIgnoreCase(str2) = " + str1.equalsIgnoreCase(str2));
        System.out.println("str3.equalsIgnoreCase(str4) = " + str3.equalsIgnoreCase(str4));
    }
}
