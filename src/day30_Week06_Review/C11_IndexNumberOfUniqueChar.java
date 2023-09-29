package day30_Week06_Review;

public class C11_IndexNumberOfUniqueChar {

    public static void main(String[] args) {

        String str = "kabbAXXXBBCCk";

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch)==str.lastIndexOf(ch)) {
                result = str.indexOf(ch);
                break;
            }
        }
        System.out.println("result = " + result);




    }
}
