package day34_Arrays_04;

public class C04_ReverseSecondWord {

    public static void main(String[] args) {

//        System.out.println(reverseWord("Love"));
//        System.out.println(reverseSentence("I Love Java"));
        System.out.println("reverseSecondWord(\"I Love Java\") = " + reverseSecondWord("I Love Java"));
        System.out.println("reverseSecondWord2(\"I Love Java\") = " + reverseSecondWord2("I Love Java"));


    }

     public static String reverseSecondWord(String str){
        String reversed="";
        String result="";
        reversed = reverseSentence(str);
        String[] reversedArr = reversed.split(" "); //Java Love I
        reversedArr[1] = reverseWord(reversedArr[1]); // evoL

        for (String word : reversedArr) {
            result+=word+" ";
        }
        return result;
    }

    public static String reverseSentence(String str){
        String reversed="";
        String[] words = str.split(" ");
//        System.out.println(Arrays.toString(words));
        for (int i = words.length - 1; i >= 0; i--) {
            reversed+=words[i]+" ";
        }
        return reversed;
    }


    public static String reverseWord(String str){
        String result="";

        for (int i = str.length()-1; 0<=i ; i--) {
            result+=str.charAt(i);
        }
        return result;
    }

    public static String reverseSecondWord2(String str){ // I love Java
        String result ="";
        String[] words = str.split(" ");//["I","love","Java]
        //words[1] String Love
        String reversed=""; // evoL
        for (int i = words[1].length()-1; 0<=i ; i--) {
            reversed+=words[1].charAt(i);
        }
        words[1]=reversed;           // ["I","evoL","Java]

        for (String word : words) {
            result+=word+" ";
        }
        return result; // I evoL Java
    }



}

/*
Write a program that can reverse the second word of the sentence
	1		Ex:
				sentence = "I Love Java";
			output:
				Java evoL I

    2		Ex:
    sentence = "I Love Java";
        output:
                I evoL Java
 */