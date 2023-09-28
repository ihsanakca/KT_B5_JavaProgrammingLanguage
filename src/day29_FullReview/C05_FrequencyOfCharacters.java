package day29_FullReview;

public class C05_FrequencyOfCharacters {
    public static void main(String[] args) {

        System.out.println("frequencyOfChar(\"AAAABBBCDD\",'B') = " + frequencyOfChar("AAAABBBCDD", 'B')); //4
        System.out.println("frequencyOfChar(\"!!!!!!!!!!!!asdadadasdasdasd\",'!') = " + frequencyOfChar("!!!!!!!!!!!!asdadadasdasdasd", '!'));
        System.out.println("frequencyOfChar(\"123123123123123asdadasdasdasdv\",'1') = " + frequencyOfChar("123123123123123asdadasdasdasdv", '1'));
        System.out.println("frequencyOfChar(\"AAAABBBCDD\",'F') = " + frequencyOfChar("AAAABBBCDD", 'F'));
    }



    public static int frequencyOfChar(String str, char targetChar){
        int freq=0;
        for (int i = 0; i <str.length(); i++) {
            char charOfString = str.charAt(i);
             if(charOfString == targetChar){
                 freq++;
             }
        }
        return freq;
    }

}
/*Write a method that can return the frequency of a char from a String

			Ex:
				str = "AAAABBBCDD" ch = 'A'

			Output:
				4*/