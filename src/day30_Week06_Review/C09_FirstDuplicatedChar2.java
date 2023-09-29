package day30_Week06_Review;

public class C09_FirstDuplicatedChar2 {

    //Samet'in çözümü

    public static void main(String[] args) {

        String str = "kabbAXXXBBCCk";

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);
            if (str.substring(i + 1).contains(ch)) {
                result = str.indexOf(ch);
                //System.out.println(result);
                break;
            }
        }
        System.out.println("result = " + result);
        System.out.println(str.charAt(result));
    }


}

