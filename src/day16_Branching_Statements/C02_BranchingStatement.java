package day16_Branching_Statements;

public class C02_BranchingStatement {
    public static void main(String[] args) {

        // break - continue - return

        System.out.println("program başladı");
        for (int i = 0; i < 100; i++) {
            if(i>10){
                break;
            }

            System.out.println(i+" ");
        }

        System.out.println("program sonlandı");

    }
}
