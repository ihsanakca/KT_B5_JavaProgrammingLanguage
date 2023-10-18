package day43_Inheritance_AccessModifiers;

public class C01_Parent extends Object{
    protected int x=55464574;
    String parentName;
    String parentName2;

    C01_Parent(){
        System.out.println("in parent");
    }

    C01_Parent(String parentName){
        this.parentName =parentName;
    }
    C01_Parent(String parentName,String parentName2){
       this.parentName =parentName;
       this.parentName2=parentName2;
    }





}


