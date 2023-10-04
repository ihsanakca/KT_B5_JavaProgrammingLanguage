package day33_Arrays_03;

import java.util.Arrays;

public class C01_Alphabet {

    public static void main(String[] args) {

        char[] alphabet;  // declare  -tion
        alphabet = new char[26]; //instantiate

        System.out.println(alphabet);
        char charArr[] = {'1','2','3'}; // literal way
        int intArr[] = {1,2,3,4,5,6};
        System.out.println(intArr);  // referanci sout
        System.out.println(Arrays.toString(intArr)); // array elements will be printed

        System.out.println(charArr);

        // when u print char Arr System.out.println (), Java implicitly converts each char in the array
        // to its Unicode chars and print them to the console

        System.out.println(alphabet);
        char ch ='A';

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = ch;
            ch++; // 65 66
        }

        System.out.println(alphabet);
        System.out.println(Arrays.toString(alphabet));
        for (char c : alphabet) {
            System.out.println(c);
        }

        ch ='z';

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i]=ch;
            ch--;

        }

        System.out.println(alphabet);
        System.out.println(Arrays.toString(alphabet));
        for (char c : alphabet) {
            System.out.println(c);
        }

    }
}
