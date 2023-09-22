package day25_Week05_Review;

public class C08_Replace {

    public static void main(String[] args) {

        String s1= " Java Java Java";
        s1 = s1.replace("a", "e");
        System.out.println(s1);

        String s2= " Java Java Java";
        s2= s2.replace("Java", "Python");
        System.out.println(s2);

        String s3= " Java Java Java";
        s3= s3.replaceFirst("Java","Python");
        System.out.println(s3);

        String s4= " Java1 Java2 Java3";
        s4= s4.replaceAll("[0-9]", " Python"); //regular expression regex
        System.out.println(s4);

    }



}
