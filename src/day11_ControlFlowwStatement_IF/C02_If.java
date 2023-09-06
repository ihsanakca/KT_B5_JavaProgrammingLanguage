package day11_ControlFlowwStatement_IF;

public class C02_If {
    public static void main(String[] args) {
        int x=4;
        boolean a=(x<=5);// true

        if(a){
            System.out.println(x+" 5 e eşit yada küçüktür");
            System.out.println(x++);
        }
            System.out.println(x);
    }
}
