package day36_WrapperClasses;

public class C03_WrapperClass_Characters {
    public static void main(String[] args) {
        /*
        Character.isLetter() --- harf olup olmadığını
        Character.isDigit()   --  sayı rakam olup olmadığını
        Character.isAlphabetic() --- harf olup olmadığını

         */

        System.out.println(Character.isAlphabetic('a'));
        System.out.println("Character.isLetter(\"1\") = " + Character.isLetter('1'));


        String str = "^+!j4564*/-a_|v-:!a ???()&+";

        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))){
                result+=str.charAt(i);
            }

        }

        System.out.println("result = " + result);


//        String değer içindeki gömülü cümleyi çıkartın

        String str2 ="|''11'*>>///M++>,,_//*e%%&/'-~~&&r//%<" +
                ">/)h*>%//'9a+%^^^((b*><###a678* +%&&/))<+J>>>>**56a##v**||" +
                ";;;~~a~>>> 4500001||<<İ**##n**--//+%^^s>><<|*478a12%%n**-<<|||>>01" +
                "2345l679--a**//##++34r``~~((ı[234]+||";
        String result2="";

        for (int i = 0; i < str2.length(); i++) {
            if (Character.isLetter(str2.charAt(i)) || str2.charAt(i)==' '){
                result2+=str2.charAt(i);
            }
        }
        System.out.println(result2);


        String harf="";
        String sayilar="";
        String karakter="";
        for (int i = 0; i < str2.length(); i++){
            if (Character.isLetter(str2.charAt(i))){
                harf+=str2.charAt(i);
            } else if (Character.isDigit(str2.charAt(i))) {
                sayilar+=str2.charAt(i);
            }else{
                karakter+=str2.charAt(i);
            }
        }

        System.out.println("harf = " + harf);
        System.out.println("sayilar = " + sayilar);
        System.out.println("karakter = " + karakter);


    }


}
