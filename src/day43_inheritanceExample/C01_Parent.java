package day43_inheritanceExample;

public class C01_Parent {

    protected int x =20;
    protected int y =21;
    protected  C01_Parent(int y){
        System.out.println("Parent Constructor");
        this.y=y;
    }
}
