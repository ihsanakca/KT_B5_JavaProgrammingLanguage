package day34_Arrays_04;

import java.util.Arrays;

public class C05_TasksCont {

    public static void main(String[] args) {


        System.out.println(Arrays.toString(createIntegerArray(10)));
        System.out.println(averageOfMaxMin(createIntegerArray(10)));
    }

    //Bir method yazın int n parametre olarak alsın. n değeri kadar sayıları sıralı bir
    //biçimde bir array içine yerleştirsin. n = 5 Exm: [0,1,2,3,4]
    public static int[] createIntegerArray(int n){
        int[] intArr = new int[n];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i]=i;
        }
        return intArr;
    }

    //Bir sayı dizisinin en büyük ve en küçük element lerinin aritmetik ortalamasını
    //veren bir method yazın.
    public static double averageOfMaxMin(int[] arr){
        double avg=0;
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            } else if (arr[i]<min) {
                min=arr[i];
            }
        }
        avg=(min+max)/2.0;

        return avg;
    }

    public static double averageOfMaxMin2(int[] arr){
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        return ((min+max)/2.0);
    }



}
