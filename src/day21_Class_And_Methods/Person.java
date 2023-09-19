package day21_Class_And_Methods;

public class Person {
    // fields--- yaş isim cinsiyet
    // aksiyon-- uyu(), oyunOyna()


    String name;
    String gender;
    int age;
    String tcNo;
     double yılSonuOrtalama;


    public void uyu(){
        System.out.println(name+" uyuyor");
    }

    public void oyunOyna(){
        System.out.println(name+" Oyun oynuyor");
    }


    public String average(double d){
        if (d<50){
            return "C";
        }else if(d<75){
            return "B";
        }else{
            return "A";
        }
    }

}
