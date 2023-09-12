package day16_Branching_Statements;

public class C03_TekSayilar {
    public static void main(String[] args) {
        System.out.println("program başladı");

        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                continue;
            }
            if(i>10){
                break;
            }

            System.out.println(i+" ");
        }





        System.out.println("program sonlandı");
    }
}
