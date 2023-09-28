package day29_FullReview;

public class C03_RemoveDuplicates {
    public static void main(String[] args) {

        System.out.println("removeDuplicateChars(\"AABBCCBC\") = " + removeDuplicateChars("AABBCCBC"));
        System.out.println("removeDuplicateChars(\"Write a method that can remove the duplicated characters from a String\") = " + removeDuplicateChars("Write a method that can remove the duplicated characters from a String"));
    }


    /**
     * This method removes the duplicated characters from a String
     * @param str
     * @return
     */
    public static String   removeDuplicateChars(String str){
        String result="";

        for (int i = 0; i < str.length() ; i++) {
            String ch = str.charAt(i)+"";
            if(!result.contains(ch)){
                result+=ch;
            }
        }
        return result;
    }


}
/*Write a method that can remove the duplicated characters from a String

			Ex:
				input:
					//AABBCCBC
                      01234567
				Output:
					ABC

			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding*/