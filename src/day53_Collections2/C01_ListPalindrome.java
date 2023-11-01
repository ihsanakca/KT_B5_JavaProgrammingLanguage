package day53_Collections2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ListPalindrome {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("kazık","adanada","kazak","radar","ses","harun","ses", "radar","aga","ada","ada"));
        System.out.println(list);
        System.out.println("palindromesInTheList(list) = " + palindromesInTheList(list));
    }

    public static String palindromesInTheList(List<String> list){
        String result="";
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String reverse="";
            for (int j = str.length()-1; 0<=j ; j--) {
                reverse+=str.charAt(j);
            }
            if(str.equalsIgnoreCase(reverse)){
                result+=reverse+" ";
            }
            list.removeAll(Arrays.asList(str));
            i--;

        }


       return result;
    }


}

//list içerisinde bulunan polindrom (terside kendisine ayni  olan kelimeler) kelimeleri string olarak donen
// metodu yazınız.(aynı kelimeleri ekrana yazma-sın)
//kazık,adanada,kazak,radar,ses,harun,ses, radar,aga,ada,ada
//adanada,kazak,radar,ses,aga,ada