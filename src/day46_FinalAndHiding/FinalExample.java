package day46_FinalAndHiding;

public class FinalExample {
     final static int X; // final değişkenler büyük harf ile yazılır


     static {
         X=5;
     }
    int method(int x){

       //  this.X=this.X+3;// 8
        return x*5; // 40
    }

}
