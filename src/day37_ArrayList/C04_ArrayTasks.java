package day37_ArrayList;

import java.util.ArrayList;

public class C04_ArrayTasks {
    public static void main(String[] args) {
    ArrayList<Integer> listOfNums=new ArrayList<>();
    listOfNums.add(5);
    listOfNums.add(10);
    listOfNums.add(15);
    listOfNums.add(20);
    listOfNums.add(25);
    listOfNums.add(25);
    listOfNums.add(100);
    listOfNums.add(100);
    listOfNums.add(500);


        ArrayList<String> arrList2=new ArrayList<>();
        arrList2.add("10");
        arrList2.add("100");
        arrList2.add("101");
        arrList2.add("1000");


       // System.out.println("listOfNums = " + listOfNums);
        printListNumbers(listOfNums);
        System.out.println("sum(listOfNums) = " + sum(listOfNums));

        System.out.println("dublicate(listOfNums) = " + dublicate(listOfNums));

        System.out.println("toIntList(arrList2) = " + toIntList(arrList2));
        System.out.println(toIntList(arrList2).get(0)+22);


        ArrayList<Integer> rakamList = new ArrayList<>();
        rakamList.add(1);
        rakamList.add(2);
        rakamList.add(3);
        rakamList.add(4);
        rakamList.add(5);



        System.out.println("kayanList(rakamList,4) = " + kayanList(rakamList, 7));


    }


    //5,10,15,15,20,25,25,100,100,500 rakamlarını
// listOfNums isili bir ArrayListe atın ve
//printListNumbers(listOfNums); methodu ile yazdıralım.


    public static void printListNumbers(ArrayList arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+" ");
        }
    }


    // burada giren verinin integer olması garanti altına alınıyor ki hata almasın
    public static int sum(ArrayList <Integer> arrayList){
        int result=0;
        for (int i = 0; i < arrayList.size(); i++) {
            result+=arrayList.get(i);
        }
        return result;
    }


    public static ArrayList<Integer> dublicate(ArrayList<Integer> arrayList){
        ArrayList<Integer> arrIntList=new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            arrIntList.add(arrayList.get(i));
            arrIntList.add(arrayList.get(i));
        }

       return arrIntList;
    }

    /*
    "10","100","101","1000" sayılarını stringNums isimli arrayList e atalım.
    toIntList(stringNums); methodu Integer bir arrayList e convert edip
    döndürelim.


     */

    public static ArrayList<Integer> toIntList(ArrayList<String> arrStringList){
        ArrayList<Integer> arrIntList=new ArrayList<>();

        for (int i = 0; i < arrStringList.size(); i++) {
            arrIntList.add(Integer.valueOf(arrStringList.get(i)));
        }

        return arrIntList;
    }

    public static ArrayList<Integer> kayanList(ArrayList<Integer> sayilar, int kaymaMiktari){
        kaymaMiktari = kaymaMiktari % sayilar.size();
        ArrayList<Integer> kynList =new ArrayList<>(sayilar.size());
        for (int i = 0; i < kaymaMiktari; i++) {
            sayilar.add(i, sayilar.get(sayilar.size()-(kaymaMiktari-i)));
            sayilar.remove(sayilar.size()-(kaymaMiktari-i));
            kynList=sayilar;

        }
        return kynList;

    }

    //
    //ödev
    // yeni bir arrayList oluşturun içerisine 5 adet sayı ekleyin
    // dondur(int x) x kadar sayıları kendi içerinde döndürsün
    //  1 2 3 4 5    dondur(int 1)  51234    dondur(int 3)  34512  dondur(2)    45123 yeni bir arrylist


    //ArrayList<Integer> myList = getList(20);//return method System.out.println(myList); ödev
    // 20 ye kadar olan sayıları liste atsın...
    //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
}
