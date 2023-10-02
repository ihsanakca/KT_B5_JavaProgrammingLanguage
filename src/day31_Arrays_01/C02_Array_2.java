package day31_Arrays_01;

public class C02_Array_2 {
    public static void main(String[] args) {
        int [] arr1;
        arr1=new int[5];
        arr1[0]=23;
        arr1[1]=34;
        arr1[2]=54;
        arr1[3]=27;
        arr1[4]=89;

        System.out.println("arr1.length = " + arr1.length);
/*
        for (int i = 0; i < 5; i++) {
            System.out.println("arr1["+i+"] = " + arr1[i]);
        }


        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1["+i+"] = " + arr1[i]);
        }
*

 */

        for ( int x:arr1) {
            System.out.println("x = " + x);
        }


        int ciftsayi=0;
        for (int abc:arr1) {
            if(abc%2==0){
                ciftsayi++;
            }
        }
        System.out.println("çiftsayi = " + ciftsayi);


        int teksayi=0;
        for (int abc:arr1) {
            if(abc%2!=0){
                teksayi++;
            }
        }
        System.out.println("teksayi = " + teksayi);



        // arrayin içerisindeki tüm verileri toplayan ve ekrana yazdırna bir for each loop yapın

        int toplam=0;
        for (int x:arr1) {
            toplam+=x;
        }
        System.out.println("toplam = " + toplam);



        String str[]=new String[4];
        str[0]="Hatice";
        str[1]="Atakan";
        str[2]="Burcu";
        str[3]="Ayşe";

        for (String name:str) {
            System.out.println(name+" çalışkan bir öğrencidir");
        }
    }


    public static String method1(){

        return "";
    }

    public static String[] arrayMethod2(){
    String [] arr={"Ahmet","Mehmet"};
        return arr;
    }

    public static String arrayMethod3(String [] arr){
        return arr[0];
    }


}
