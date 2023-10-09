package day31_Arrays_01;

import java.util.Scanner;

public class C02_Array_1 {

    public static void main(String[] args) {

        int [] x=new int[5];

        int y[];
        y=new int[5];

      //  String []str=new String[2];

        x[0]=105;
        x[3]=54;

        System.out.println("x[0] = " + x[0]);
        System.out.println("x[3] = " + x[3]);
        System.out.println("x[1] = " + x[1]);

        System.out.println("x = " + x);

        Scanner scanner=new Scanner(System.in);

        String [] str=new String[4];
        str[0]="Hatice";
        str[1]="Atakan";
        str[2]="Burcu";

        System.out.println("str[0] = " + str[0]);
        System.out.println("str[3] = " + str[3]);


        int [] arr1;
        arr1=new int[5];
        arr1[0]=23;
        arr1[1]=34;
        arr1[2]=54;
        arr1[3]=27;
        arr1[4]=89;
     //   arr1[5]=105;

     //   System.out.println("arr1[5] = " + arr1[5]);


        int []arr2={23,34,54,27,89};

        System.out.println("arr2[0] = " + arr2[0]);
        System.out.println("arr2[4] = " + arr2[4]);
        arr2[0]=45;
        System.out.println("arr2[0] = " + arr2[0]);
      //  arr2[5]=56;


        int [] arr4={23,65,78,98};


        //2 değer alan int türünde bir array oluşturun
        // değer atayın sonra ve bu iki değeri
        // toplayın ve ekrna yazdırın

        int[] array=new int[2];
        array[0]=44;
        array[1]=32;
        System.out.println(array[0]+array[1]);

        String hi="merhaba";



    }
}
