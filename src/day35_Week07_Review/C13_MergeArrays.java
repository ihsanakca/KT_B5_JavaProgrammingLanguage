package day35_Week07_Review;

import java.util.Arrays;

public class C13_MergeArrays {

    public static void main(String[] args) {


        String[] group1 = {"Ali", "Veli","Murat"};
        String[] group2 = {"Aliş", "Veliye"};

        String[] groups1_2 = new String[group1.length + group2.length];

        int i = 0;
        for (String each : group1) {
            groups1_2[i] = each;
            i++;
        }
        //System.out.println(Arrays.toString(groups1_2));
        //System.out.println("i = " + i);
        for (String each : group2) {
            groups1_2[i] = each;
            i++;
        }

        System.out.println(Arrays.toString(groups1_2));


    }
}
