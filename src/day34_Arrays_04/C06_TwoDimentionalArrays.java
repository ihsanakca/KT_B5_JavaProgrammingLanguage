package day34_Arrays_04;

import java.util.Arrays;

public class C06_TwoDimentionalArrays {
    public static void main(String[] args) {
        String[][] str = new String[2][3];
        str[0][0]="Muhammed"; // str[i][j]
        str[0][1]="Burcu";
        str[0][2]="Emre";
//        str[0][3]="Muhammed"; //Index 3 out of bounds for length 3
        str[1][0]="Samet";
        str[1][1]="Atakan";
        str[1][2]="Omer";
//        str[2][0]="Muhammed"; // Index 2 out of bounds for length 2
        System.out.println("str.length = " + str.length);
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j <str[i].length ; j++) {
                System.out.print(str[i][j]+" ");
            }
            System.out.println();

        }

        System.out.println("Arrays.toString(str) = " + Arrays.toString(str));
        System.out.println("Arrays.deepToString(str) = " + Arrays.deepToString(str));


    }
}
