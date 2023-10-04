package day32_Arrays_02;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays_Methods {


    public static String [] kelimeDepola(){

        Scanner scan=new Scanner(System.in);
        System.out.println("1. Kelime : ");
        String kelime1=scan.nextLine();
        System.out.println("2. Kelime : ");
        String kelime2=scan.nextLine();
        System.out.println("3. Kelime : ");
        String kelime3=scan.nextLine();

        String [] array=new String[3];
        array[0]=kelime1;
        array[1]=kelime2;
        array[2]=kelime3;

        return array;
    }




    //Bir method yazın ve int[] kabul etsin. length i 5 den büyükse true döndürsün.

    public static boolean uzunlukKontrol(int [] array){
        return array.length>5;

    }






        //Bir method yazın int array kabul etsin
         // array in içinde 5 olup olmadığını kontrol etsin.

    public static boolean sayiKontrol(int [] array, int sayi){
        for (int x:array ) {
            if (x==sayi){
                return true;
            }
        }
        return false;
    }


    public static boolean sayiKontrol2(int [] array, int sayi){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==sayi){
                return true;
            }
        }


        return false;
    }







    // Bir method yazın ve 2 array kabul etsin ilk elemanları eşitse true döndürsün.


    public static boolean ilkElemanEsitMi(int [] arr1, int [] arr2){
        return arr1[0]==arr2[0];
    }

    public static boolean ilkElemanEsitMi(String  [] arr1, String [] arr2){
        return arr1[0].equalsIgnoreCase(arr2[0]);
    }







    //2 array kabul eden bir method yazın ve arraylerin
    // llk elemanları ile yeni bir array döndürsün.


    public static int [] newArray(int [] a, int[] b){
        int [] array=new int[2];
        array[0]=a[0];
        array[1]=b[0];
        return array;
    }

    public static double [] newArray(double [] a, double[] b){
        double [] array=new double[2];
        array[0]=a[0];
        array[1]=b[0];
        return array;
    }




//Int array in elemanlarının toplamını veren bir method yazın

    public static int arrayToplam(int [] array){
        int sum=0;
        for (int x:array ) {
            sum+=x;
        }
        return sum;
    }


    public static double arrayToplam(double [] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }





    //İnt array ın elemanlarının toplamını ve çarpımını yeni
    // bir array içinde döndüren bir method yazın.


    public static int [] toplamVeCarpim(int []array){
        int toplam=0;
        int carpım=1;



        for (int i = 0; i < array.length; i++) {
            toplam+=array[i];
            carpım*=array[i];
        }

        int [] newArray=new int[2];
        newArray[0]=toplam;
        newArray[1]=carpım;

        return newArray;
    }





    public static int [] toplamVeCarpim2(int []array){ // 23 34  54 65
        int [] newArray=new int[2];
        newArray[1]=1;
        for (int i = 0; i < array.length; i++) {
            newArray[0]+=array[i];
            newArray[1]*=array[i];
        }
        return newArray;
    }


    public static void main(String[] args) {
        // System.out.println("kelimeDepola()[0] = " + kelimeDepola()[0]);

        int [] arr1;
        arr1=new int[6];
        arr1[0]=23;
        arr1[1]=34;
        arr1[2]=54;
        arr1[3]=27;
        arr1[4]=89;
        arr1[5]=89;



        int [] arr2;
        arr2=new int[4];
        arr2[0]=232;
        arr2[1]=343;
        arr2[2]=543;
        arr2[3]=273;
        System.out.println("uzunlukKontrol(arr1) = " + uzunlukKontrol(arr1));

        System.out.println(sayiKontrol2(arr1, 23));
        System.out.println("ilkElemanEsitMi(arr1,arr2) = " + ilkElemanEsitMi(arr1, arr2));

        System.out.println("Arrays.toString(newArray(arr1,arr2)) = " + Arrays.toString(newArray(arr1, arr2)));

        System.out.println("---------------");


        System.out.println("arrayToplam(arr1) = " + arrayToplam(arr1));

        System.out.println("---------------");

        System.out.println("Arrays.toString(toplamVeCarpim2(arr1)) = " + Arrays.toString(toplamVeCarpim2(arr1)));
        System.out.println("---------------");
        System.out.println("Arrays.toString(arrayBirlestir2(arr1,arr2)) = " + Arrays.toString(arrayBirlestir2(arr1, arr2)));
    }


    // Verilen 2 arrayi birleştirip array döndüren bir method yazın.


    public static int [] arrayBirlestir(int [] arr1, int []arr2){//  5     3
        int [] newArray=new int[arr1.length+arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            newArray[i]=arr1[i];
        }

        int j=0;
        for (int i = arr1.length; i < newArray.length; i++) {
            newArray[i]=arr2[j];
            j++;
        }

        return newArray;
    }

    public static int [] arrayBirlestir2(int [] arr1, int []arr2){
        int [] newArray=new int[arr1.length+arr2.length];

        for (int i = 0, j=0; i < newArray.length; i++) {
           if (i<arr1.length){
               newArray[i]=arr1[i];
           }else {
               newArray[i]=arr2[j];
               j++;
           }
        }



        return newArray;
    }


}
