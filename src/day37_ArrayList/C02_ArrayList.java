package day37_ArrayList;

import java.util.ArrayList;

public class C02_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrList=new ArrayList<>();

        // add();  --- arraylist e veri eklemek için kullanılır
        arrList.add("Burcu");
        arrList.add("Ömer");
        arrList.add("Emre");

        System.out.println("arrList = " + arrList);

        // clear();  -- list i temizler-- boşaltır
      //  arrList.clear();

        System.out.println("arrList = " + arrList);

        // get();  --  istediğimiz herhangi bir veriyi çağırır
        System.out.println("arrList.get(1) = " + arrList.get(1));
        System.out.println("arrList.get(2) = " + arrList.get(2));
    //    System.out.println("arrList.get(3) = " + arrList.get(3)); // IndexOutOfBoundsException


        //  size();
        System.out.println("arrList.size() = " + arrList.size());
        System.out.println("arrList.get(arrList.size()-1) = " + arrList.get(arrList.size() - 1));

        arrList.add(1,"Ahmet");
        System.out.println("arrList = " + arrList);

        //     [Burcu, Ahmet, Ömer, Emre]
        // remove()
        arrList.remove(1);  // [Burcu, Ömer, Emre]
        System.out.println("arrList = " + arrList);

        // set() --- veri değiştirmek istersek kullanırız
        arrList.set(0,"Ahmet");// [Ahmet, Ömer, Emre]
        System.out.println("arrList = " + arrList);


        // indexOf();
        System.out.println("arrList.indexOf(\"Ahmet\") = " + arrList.indexOf("Ahmet"));

        // remove();
        arrList.remove("Ahmet");
        System.out.println("arrList = " + arrList);




    }

}
