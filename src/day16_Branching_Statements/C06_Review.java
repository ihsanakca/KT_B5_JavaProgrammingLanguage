package day16_Branching_Statements;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class C06_Review {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            System.out.print("B");


            for (int j = 0; j < 10; j++) {
                if (j>2){
                    continue;
                }

                if(j==5){
                    System.out.print("C");
                    break;
                }
                System.out.print("A");
            }

            System.out.println();
        }
//B


// break ve continue İÇERİNDE BULUNDUĞU DÖNGÜYÜ ETKİLER
        // BREAK-- İÇERİNDE BULUNDUĞU DÖNGÜNÜN SONUNA
        // CONTİNUE -- İÇERİSİNDE BULUNDUĞU DÖNGÜNÜN BAŞINA GİDER


    }
}
