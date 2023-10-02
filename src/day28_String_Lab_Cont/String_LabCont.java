package day28_String_Lab_Cont;

public class String_LabCont {



    //Kullanıcıdan bir kelime veya söz alın ve ilk 5
    // karakterini yazdırın. 5 karakterin altında bir kelime girdiği taktirde
    // 5 karaktere nokta ile tamamlayın.
    //Sabun Sabun Merhaba Merha Ali Ali..
    //Hey Hey..
    //Pi Pi...

    public static String karakterTamamla(String str, int number, char karakter){
        if (str.length()>=number){
            return str.substring(0,number);
        }
        /*
        int count=5-str.length();// al    2    5-2=3  eklenecek nokta
        for (int i = 0; i < count; i++) {
            str+=".";
        }
         */

        for (int i = str.length(); i <number ; i++) {
            str+=karakter;
        }
        return str;
    }



    /*
       Kullanıcıdan bir kelime alın ve kin kelimesi başından veya
       ilk karakterden sonra gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;
       Kinlenmek true
       Kin tutmak true
       Ekin ektim true
       Keskin ilçesinden geçiyorum false
        Neden kin tutuyorsun false */


    public static boolean kelimeKontrol(String str, String control){
        if (str.startsWith(control)){
            return true;
        } else if (str.substring(1).startsWith(control)) {
            return true;
        }
            return false;
    }

    public static boolean kelimeKontrol1(String str, String control){
        str=str.toLowerCase();
        control=control.toLowerCase();
        return str.startsWith(control) || str.substring(1).startsWith(control);
    }

    public static boolean kelimeKontrol2(String str, String control){
        str=str.toLowerCase();
        control=control.toLowerCase();
        return str.substring(0,control.length()+1).contains(control);
    }




    //Kullanıcıdan bir kelime alın ve
// bu kelimenin ilk 2 harfi sonunda
// yer alıyorsa true almıyorsa false yazdırın.

    public static boolean ilkSonKelime(String str){
        return str.substring(0,2).equalsIgnoreCase(str.substring(str.length()-2));
    }

    public static boolean ilkSonKelime2(String str,int karakter){
       if (karakter<1 || str==null || str.length()<karakter){
           return false;
       }

        return str.substring(0,karakter).equalsIgnoreCase(str.substring(str.length()-karakter));
    }



    //Kullanıcının  ad ve soyad bilgilerini
    //  Ekrana "Soy isminiz ..(soyad)" Yazan metodu yazınız.

    //İnput: "Harun Özsoy "
    //Output: "Soy isminiz Özsoy dır."
    //İnput:" Harun Kenan Özsoy " Output: "Soy isminiz Özsoy"
    //İnput: "Harun Kenan Can Özsoy " Output: "Soy isminiz Özsoy"
    //İnput:" Harun Kenan Can Sami Özsoy" Output: "Soy isminiz Özsoy"
    //Kullanıcı başına ve sonuna dilediği kadar boşluk girebilir lütfen
    // bu durumu dikkate alın. Output’u dikkatli inceleyin.


    public static String sonKelime(String str){
        str=str.trim();

        String substring = str.substring(str.lastIndexOf(" "));

        return substring;
    }
//Kullanıcıdan bir dize sözcük alın ve yinelenen
// her karakteri kelimenizden çıkartarak sonuç
// döndüren metodu yazınız. (Büyük küçük duyarlı)

    //Merhaba Merhab Ananas Anas



    public static String yenilenenCıkart(String str){// merhaba
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.substring(i,i+1))){
                result+=str.substring(i,i+1);
            }
        }
        return result;
    }

    public static String yenilenenCıkart2(String str){// merhabam  --- erhaba  --- rhaba
        String result="";
        for (; 0 < str.length();) {
            result+=str.substring(0,1);
            str=str.replace(str.substring(0,1),"");
        }
        return result;
    }

    
    public static void main(String[] args) {
        String str="MerhabababbMrr";
        System.out.println(yenilenenCıkart2(str));
    }

}
