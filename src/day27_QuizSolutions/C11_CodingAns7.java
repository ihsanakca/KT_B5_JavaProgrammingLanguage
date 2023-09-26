package day27_QuizSolutions;

public class C11_CodingAns7 {
    public static void main(String[] args) {
        if(equalsIgnoreCase("Ahmet","ahmed")) System.out.println("Stringler ayni kelimedir");
    }



    public static boolean equalsIgnoreCase(String str1, String str2){
        return str1.toLowerCase().equals(str2.toLowerCase());
    }
}

//7.equalsIgnorecase() metodunu kullanmadan girilen 2 string türündeki değeri
//        büyükküçük harfleri baz almadan kontrol eden bir metot yazınız.