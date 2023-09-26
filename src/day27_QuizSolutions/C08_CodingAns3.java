package day27_QuizSolutions;

import java.util.Scanner;

public class C08_CodingAns3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String str = scanner.nextLine();
        System.out.println("Lutfen bir harf giriniz");
        char ch = scanner.nextLine().charAt(0);
        System.out.println(str+"'da "+frequency(str,ch)+ " adet \""+ ch+"\" bulunmaktadir.");

    }



    public static int frequency(String str,char ch){
        return str.length() - str.replace(""+ch,"").length();
    }


}

//merhaba   7
//a  merhb      5   ==> 7 - 5 = 2

//Kullanicidan bir String bir de char alin. Stringin icinde kac tane char oldugunu
//donen bir metodla sayiyi hesaplatin. Stringde kac adet o harften oldugunu da
//asagidaki formatta ekrana yazdirin.
//Ornek:input “Merhaba”, ‘a’ output= Merhaba ‘da 2 adet a bulunmaktadir.
//frequency(String str,char ch)