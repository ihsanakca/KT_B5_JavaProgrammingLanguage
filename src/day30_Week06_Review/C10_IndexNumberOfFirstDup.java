package day30_Week06_Review;

public class C10_IndexNumberOfFirstDup {

    public static void main(String[] args) {
        String str = "kabbAXXXBBCCk";
        String result = "";


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // each character from string
            int frequency = 0;

            for (int i = 0; i < str.length(); i++) { //to find the frequency of each character

                char duplicated = str.charAt(i); // each character of str
                if (ch == duplicated) {
                    frequency++;
                }


            }
            if ((frequency > 1)) {
                result += ch;
                break;

            }
        }
        System.out.println(str.indexOf(result));
    }
}

/*
2. Write a program that can return the index number of the first duplicated character from a string


 */