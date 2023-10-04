package day33_Arrays_03;

import java.util.Arrays;
import java.util.Scanner;

public class C02_Tasks {

    public static void main(String[] args) {

        int[] intArr ={1,2,30, -400,41,66};
        System.out.println("maxOfArray(intArr) = " + maxOfArray(intArr));

        System.out.println("minOfArray(intArr) = " + minOfArray(intArr));


        System.out.println("Arrays.toString(swapFirstAndLast(intArr)) = " + Arrays.toString(swapFirstAndLast(intArr)));

        System.out.println("Arrays.toString(reverseArray(intArr)) = " + Arrays.toString(reverseArray(intArr)));

        System.out.println("sumOfOddIndex(intArr) = " + sumOfOddIndex(intArr));

        System.out.println("Arrays.toString(createStringArray()) = " + Arrays.toString(createStringArray()));


    }

    /**
     * this method returns the biggest int of an integer array
     * @param arr
     * @return
     */
    public static int maxOfArray(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            if(i>max){
                max=i;
            }
        }

        return max;
    }

    /**
     * his method returns the smallest int of an integer array
     * @param arr
     * @return
     */
    public static int minOfArray(int[] arr){
        int min = arr[0];
        min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    //    Bir array oluşturun ve ilk ve son elementleri swap(yer değiştirme) yapın

    /**
     * this method swaps the first and last element of an array
     * @param arr
     * @return
     */
    public static int[] swapFirstAndLast(int[] arr){
        int temp =arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1] = temp;
        return arr;
    };

    //    Bir method yazın ve verilen arry in elemanlarını tersden sıralayıp yeni bir array döndürsün.
    public static int[] reverseArray(int[] arr){
        int[] reversedArr = new int[arr.length];
        for (int i = arr.length - 1, j=0; i >= 0; i--,j++) {
            reversedArr[j]=arr[i];
        }
                return reversedArr;
    }


    public static int sumOfOddIndex(int[] arr){
       int sum = 0;
        for (int i = 1; i < arr.length; i+=2) {
            sum+=arr[i];
        }
       return sum;
    }

//Kullanıcıdan oluşturmak istediği string array in bilgilerini alarak string array oluşturan
//bir method yazın. Alınacak bilgiler array ın length i ve elamanları olsun.

    public static String[] createStringArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen String Arrayin uzunlugunu giriniz: ");

        int length =scanner.nextInt();
        scanner.nextLine();

        String[] strArr = new String[length];

        for (int i = 0; i < strArr.length; i++) {
            System.out.println("String Arrayin "+(i+1)+" . elemanini giriniz" );
            strArr[i]=scanner.nextLine();
        }
        return strArr;
    }





}



