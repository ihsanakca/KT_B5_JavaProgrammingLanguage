package day57_MapANdFinish;

import java.util.HashMap;
import java.util.Map;

public class C04_MapExample2 {
    public static void main(String[] args) {

        Map<String, String> rabiaKartvizit=new HashMap<>();
        rabiaKartvizit.put("isim","Rabia Çalık");
        rabiaKartvizit.put("email","rabia@gmail.com");
        rabiaKartvizit.put("adres","Ankara/Turkiye");
        rabiaKartvizit.put("telefon","0555 123 45 67");

        System.out.println(rabiaKartvizit.get("isim"));
        System.out.println(rabiaKartvizit.get("telefon"));

        Map<String, String> ahmetKartvizit=new HashMap<>();
        ahmetKartvizit.put("isim","Ahmet Beş");
        ahmetKartvizit.put("email","ahmet@gmail.com");
        ahmetKartvizit.put("adres","İstanbul/Turkiye");
        ahmetKartvizit.put("telefon","0555 987 65 43");

        System.out.println(ahmetKartvizit.get("adres"));
        System.out.println(ahmetKartvizit.get("email"));


        Map<String,Map<String,String>> kartvizitler=new HashMap<>();
        kartvizitler.put("Rabia",rabiaKartvizit);
        kartvizitler.put("Ahmet",ahmetKartvizit);

        System.out.println(kartvizitler.get("Rabia"));

        System.out.println(kartvizitler.get("Rabia").get("email"));

        System.out.println(kartvizitler.get("Ahmet"));
        System.out.println(kartvizitler.get("Ahmet").get("adres"));


        System.out.println("kartvizitler = " + kartvizitler);


    }
}
