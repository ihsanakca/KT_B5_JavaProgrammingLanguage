package day34_Arrays_04;

import java.util.Arrays;

public class C07_MultiDimArrays {

    public static void main(String[] args) {
       String[] group1 = {"ahmet","burcu","kerem"};
       String[] group2 = {"osman","dincer","emre"};
       String[] group3 = {"ayse","samet","omer"};
       String[] group4 = {"ali","muhammed","rabia"};
       String[] group5 = {"tugba","mahmut","sude"};

       String[][] groups = new String[5][];
       groups[0] =group1;
       groups[1] =group2;
       groups[2] =group3;
       groups[3] =group4;
       groups[4] =group5;
        System.out.println("groups[4][0] = " + groups[4][0]);
        System.out.println("groups[1][1] = " + groups[1][1]);

        System.out.println("Arrays.deepToString(groups) = " + Arrays.deepToString(groups));

        for (int i = 0; i < groups.length; i++) {
            System.out.println(Arrays.toString(groups[i]));
        }

        for (int i = 0; i < groups.length; i++) {
            for (int j = 0; j < groups[i].length ; j++) {
                System.out.print(groups[i][j]+" ");
            }
            System.out.println();
        }

        int [] [] [] sayilar ={{{2,2}, {3,8}, {6}, {5}},{{1,3}, {15,99}, {18,5}},{{25,5}, {23,6}, {36,88}}};

        System.out.println(Arrays.deepToString(sayilar));
        System.out.println("sayilar.length = " + sayilar.length);

        for (int[][] ints : sayilar) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    System.out.print (i+" ");
                }
                System.out.print("----");
            }
            System.out.println();
        }

    }
}
