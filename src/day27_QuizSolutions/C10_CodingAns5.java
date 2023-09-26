package day27_QuizSolutions;

public class C10_CodingAns5 {

    public static void main(String[] args) {
        System.out.println("concat(\"Quiz\",\"Kolaydi\") = " + concat("Quiz", "Kolaydi"));
        System.out.println("concat(\"Quiz\",\"Cok\",\"kolaydi\") = " + concat("Quiz", "cok", "kolaydi"));

    }


    public static String concat(String str1, String str2){
        return str1.concat(str2);
    }

    public static String concat(String str1, String str2,String str3){
        return str1.concat(str2).concat(str3);
    }
}
