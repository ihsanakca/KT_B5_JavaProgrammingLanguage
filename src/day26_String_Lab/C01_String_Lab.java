package day26_String_Lab;

import java.util.Locale;

public class C01_String_Lab {




    //Kullanıcıdan bir input alın ve girilen inputun ilk 3
    // harfini yazan , 3 kelimeden az ise inputu döndüren bir metot yazınız.
    //Merhaba Mer Ali Ali  al  al

    public static String ilkUcHarf(String str){

        if (str.length()<3){
            return str;
        }
        return str.substring(0,3);
    }



    //Kullanıcıdan bir dize sözcük alın ve her
    // boşluğa % ibaresi ekleyin. Merhaba dünya Merhaba%dünya
    // "   merhaba dünya  "   %%%merhaba%dünya%%

    public static String boslukSilYuzdeEkle(String str){
        return str.replace(" ","%");

    }


    //Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını
    // döndüren bir program yazdırın.
    //Sanayagı yagı Mutluluk uluk

    public static String ikinciYari(String str){

       return str.substring(str.length()/2);
    }


    public static String ikinciYari2(String str){


        if(str.length()%2==0){
        return str.substring(str.length()/2);}
        else {
            return str.substring(str.length()/2+1);
        }

    }


    //Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve
    // yeni harfi/harfleri alan ve buna göre kelimede/dizede sadece
    // ilk bulduğu yeri değiştiren metodu yazınız.
    //(Merhaba ,a, e) Merheba (Kasaba , a, i) Kisaba


    public static String ilkHarfDegistir(String str, String eski, String yeni){

        return str.replace(eski,yeni);
    }



    //trim(String str) şeklinde bir metot yazın trim gibi çalışsın
    // ve string döndürsün.  İçerisinde string in hazır metodu
    // olan trim metodunu kullanmayın.
    // "  harun merhaba nasılsın   "

    public static String trim(String str){
        int start=0;
        int end=0;

        for (int i = 0; i < str.length(); i++) {
           if(str.charAt(i)!=' '){
                start=i;
                break;
           }
        }

        for (int i = str.length()-1; i >=0; i--) {
            if(str.charAt(i)!=' '){
                end=i;
                break;
            }
        }

        return str.substring(start,end+1);
    }



    //Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
    //Merhaba MMMeeerrrhhhaaabbbaaa Ali AAAllliii

    public static String repeat(String str, int adet){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < adet; j++) {
                result+=str.charAt(i);
            }
        }
        return result;
    }


//tek index  numarası alan substring metodunu yazınız
    // "Merhaba"     str.substring(3)=haba
    //  subString(String str,int index)

  public static String subString(String str , int index){
        String result="";
      for (int i = index; i < str.length(); i++) {
          result+=str.charAt(i);
      }
   return result;
  }

    //çift index  numarası alan substring metodunu yazınız
    // "Merhaba"     str.substring(3,5)=ha
    //  subString(String str,int start, int end)


    public static String subString(String str , int start, int end){
        String result="";
        for (int i = start; i < end; i++) {
            result+=str.charAt(i);
        }
        return result;
    }


    //Kullanıcıdan bir kelime ve bir karakter alın
    // ve bu kelimenin istenen karakterin kaç adet olduğunu
    // döndüren metodu yazınız. (büyük küçük harf göz ardı edilecek)
    //Ankara,a 3 Edirne,e 2

    public static int karakterSay(String str, char c){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==c){
                count++;
            }
        }
        return count;
    }


    public static int karakterSay2(String str, char c){
        String x=c+"";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.substring(i,i+1).equalsIgnoreCase(x)){
                count++;
            }
        }
        return count;
    }

    public static int karakterSay3(String str, String c){
        str=str.toLowerCase();
        c=c.toLowerCase();
        int startLength = str.length();
        int finalLength = str.replace(c, "").length();
        return startLength-finalLength;
    }





    //Kullanıcıdan bir kelime ve bir harf alın
    // kelimenizin içinde bu harfin hepsi kaldırılmış şekilde string döndüren programı yazınız.
    //(Merhaba, a) Merhb

    public static String harfSil(String str,char target){
        String result="";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=target){
                result+=str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String str="Merhaba";
        String eski="Mer";
        String yeni="Ali";

        System.out.println(cokluYazdır(str, yeni,3,15,5));
        // System.out.println(trim(str));

    }

    //Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa, uzun
    // kelimeyi ortada 30 defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.

    public static String cokluYazdır(String str1,String str2, int ilkDongu,int ortaDongu, int sonDongu){
        String result="";

        if (str1.length()<str2.length()){
            for (int i = 0; i < ilkDongu; i++) {
                result+=str1;
            }
            for (int i = 0; i < ortaDongu; i++) {
                result+=str2;
            }
            for (int i = 0; i < sonDongu; i++) {
                result+=str1;
            }
        }else {
            for (int i = 0; i < ilkDongu; i++) {
                result+=str2;
            }
            for (int i = 0; i < ortaDongu; i++) {
                result+=str1;
            }
            for (int i = 0; i < sonDongu; i++) {
                result+=str2;
            }
        }
        return result;
    }

}
