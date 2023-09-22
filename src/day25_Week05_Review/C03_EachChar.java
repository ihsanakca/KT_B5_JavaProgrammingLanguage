package day25_Week05_Review;

public class C03_EachChar {

    //Ahmet ---> A h m e t

    public static void main(String[] args) {
    printEachChar("Ankaragücü");

    }
    public static void printEachChar(String str){
        //String str= "Ahmet";

        for (int i = 0; i < str.length(); i++) {

            //char ch= str.charAt(i);
            System.out.print(str.charAt(i)+" ");
        }
        
        
        
    }}
