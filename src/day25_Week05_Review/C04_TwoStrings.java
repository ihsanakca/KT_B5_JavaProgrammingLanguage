package day25_Week05_Review;

public class C04_TwoStrings {

    public static void main(String[] args) {

//        String s1 = "mUStaFA"; //Mustafa
//        String s2 = "sAndAL"; //Sandal

        name("baŞKent", "anKArA");

    }

    public static void name(String s1, String s2) {

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();


//        System.out.println(s1);
//        System.out.println(s2);

        //mustafa M  +   ustafa

        s1 = s1.substring(0, 1).toUpperCase() + s1.substring(1);
        //System.out.println("s1 = " + s1);

        s2 = s2.substring(0, 1).toUpperCase() + s2.substring(1);
        //System.out.println("s2 = " + s2);

        System.out.println((s1 + " " + s2));

    }

}
