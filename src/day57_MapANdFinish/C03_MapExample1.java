package day57_MapANdFinish;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C03_MapExample1 {
    public static void main(String[] args) {
        Ogrenci ogrenci1=new Ogrenci("Hatice","Özmen",15);
        Ogrenci ogrenci2=new Ogrenci("Kerem","Aykut",17);
        Ogrenci ogrenci3=new Ogrenci("Ömer","Özkalay",18);

/*
        List<Ogrenci> list=new ArrayList<>();
        list.add(ogrenci1);
        list.add(ogrenci2);
        list.add(ogrenci3);


        // öğrenciye nasıl ulaşacağız


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNo()==18){
                list.get(i).ekleDersler("Almanca");
                break;
            }
        }

        System.out.println(ogrenci3.getDersler());
*

 */

        Map<Integer, Ogrenci > ogrenciler=new HashMap<>();
        ogrenciler.put(ogrenci1.getNo(),ogrenci1);
        ogrenciler.put(ogrenci2.getNo(),ogrenci2);
        ogrenciler.put(ogrenci3.getNo(), ogrenci3);

        ogrenciler.get(17).ekleDersler("Ingilizce");
        ogrenciler.get(15).ekleDersler("Matematik");
        ogrenciler.get(15).ekleDersler("Türkçe");


        System.out.println(ogrenciler.get(17).getIsim());
        System.out.println(ogrenciler.get(17).getDersler());

        System.out.println(ogrenciler.get(15).getIsim());
        System.out.println(ogrenciler.get(15).getDersler());

        System.out.println(ogrenciler.get(15).toString());

    }
}
