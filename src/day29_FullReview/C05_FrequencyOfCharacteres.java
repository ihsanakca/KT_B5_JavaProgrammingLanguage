package day29_FullReview;

public class C05_FrequencyOfCharacteres {
    public static void main(String[] args) {

        System.out.println("frequencyOfChar(\"AAAABBBCDD\",'A') = " + frequencyOfChar("AAAABBBCDD", 'A')); //4
        System.out.println("frequencyOfChar(\"!!!!!!!!!!!!asdadadasdasdasd\",'!') = " + frequencyOfChar("!!!!!!!!!!!!asdadadasdasdasd", '!'));
        System.out.println("frequencyOfChar(\"123123123123123asdadasdasdasdv\",'1') = " + frequencyOfChar("123123123123123asdadasdasdasdv", '1'));

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