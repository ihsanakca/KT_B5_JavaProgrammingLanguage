package day16_Branching_Statements;

public class C09_NestedLoop_Branching {
    public static void main(String[] args) {

        outerLoop: for (int i = 0; i < 3; i++) {
            System.out.print("A");
          innerLoop:  for (int j = 0; j < 5; j++) {

                System.out.print("B");

                samet:for (int k = 0; k < 10; k++) {
                    System.out.print("C");
                  if(k==0){
                      continue innerLoop;
                  }

              }
            }
            System.out.println();
        }
    }
}
//a bc bc bc bc bc
//a bc bc bc bc bc
//a bc bc bc bc bc