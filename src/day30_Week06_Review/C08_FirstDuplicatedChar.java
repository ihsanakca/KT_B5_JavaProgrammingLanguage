package day30_Week06_Review;

public class C08_FirstDuplicatedChar {

    //Write a program that can return the first duplicated character from a string
    public static void main(String[] args) {
        String str = "AAAXBCC";

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                char duplicated = str.charAt(j);
                if (ch == duplicated) {
                    frequency++;
                }
            }
            if (frequency > 1) {
                result += ch;
                break;
            }
        }
        System.out.println(result);

    }
}














