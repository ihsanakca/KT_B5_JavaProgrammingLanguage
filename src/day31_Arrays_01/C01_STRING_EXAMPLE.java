package day31_Arrays_01;

public class C01_STRING_EXAMPLE {
    public static void main(String[] args) {
        System.out.println("harfleriSay(\"Seni seviyorum\") = " + harfleriSay("Seni seviyorum"));
        System.out.println("harfleriSay_2(\"Seni seviyorum\") = " + harfleriSay_2("Seni seviyorum"));
        System.out.println("enCokHarf(\"Merhaba\") = " + enCokHarf("Merhaba"));
        System.out.println(enCokHarf("aaaaaaaaaaaabbbbbbbbcccc"));
        System.out.println(enCokHarf("eeeemmmmsssssssssssssssssshhhhhhhhhhhhhhssssssss"));
    }
    /*
        Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki harf sayılarını başına
        yazarak ekrana döndürün.(büyük küçük harfler göz ardı edilecek)
        Merhaba 1m1e1r1h2a1b
        Seni seviyorum 2s2e1n2i1v1y1o1r1u1m
         */

    public static String harfleriSay(String str){
        String result = "";
        str = str.toLowerCase().replace(" ","");
       while (!str.isEmpty()){
           String ilkHarf = str.substring(0,1);
           int ilkHarfSayisi = str.length()-str.replace(ilkHarf,"").length();
           result +=ilkHarfSayisi+ilkHarf;
           str = str.replace(ilkHarf,"");
       }

        return result;

    }

    public static String harfleriSay_2(String str){
        String result = "";
        str = str.toLowerCase().replace(" ","");
        for (int i = 0; i < str.length(); ) {
            String ilkHarf = str.substring(0,1);
            int ilkHarfSayisi = str.length()-str.replace(ilkHarf,"").length();
            result +=ilkHarfSayisi+ilkHarf;
            str = str.replace(ilkHarf,"");
        }

        return result;

    }

    /*
    String içindeki en çok harfi döndiren metodu yazınız
    //Merhaba   --- a
    //aaaaaaaaaaaabbbbbbbbcccc   --- a
    //eeeemmmmssssssssssshhhhhhhhhhhhhhssssssss ---- s
     */
    public static String enCokHarf(String str){
        str = str.toLowerCase().replace(" ","");
        String result = "";
        int count = 0;
        while (!str.isEmpty()){
            String ilkHarf = str.substring(0,1);
            int ilkHarfSayisi = str.length()-str.replace(ilkHarf,"").length();
            if (ilkHarfSayisi>count){
                count=ilkHarfSayisi;
                result=ilkHarf;
            }
            str=str.replace(ilkHarf,"");
        }
        return result;
    }
}
