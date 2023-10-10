package day37_ArrayList;

import java.util.ArrayList;

public class C03_ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> arrList=new ArrayList<>();
        arrList.add("Burcu");
        arrList.add("Ömer");
        arrList.add("Emre");
        arrList.add("Ahmet");
        arrList.add("Yusuf");
        arrList.add("Burcu");
        arrList.add("Ömer");
        arrList.add("Emre");



        ArrayList<String> arrList2=new ArrayList<>();
        arrList2.add("Burcu");
        arrList2.add("Ömer");
        arrList2.add("Emre");


        // removeAll
        arrList.removeAll(arrList2);
        System.out.println("arrList = " + arrList);


        ArrayList<String> arrList3=new ArrayList<>();
        arrList3.add("Elma");
        arrList3.add("Armut");
        arrList3.add("Kayısı");
        arrList3.add("Üzüm");
        arrList3.add("Erik");

        ArrayList<String> arrList4=new ArrayList<>();
        arrList4.add("Armut");
        arrList4.add("Kayısı");
        arrList4.add("Üzüm");

        arrList3.removeAll(arrList4);
        System.out.println("arrList3 = " + arrList3);


    }
}
