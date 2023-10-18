package day43_Inheritance_AccessModifiers;

import day42_StaticAndInheritance.C01_Mobile_Static;

public class C02_Child extends C01_Parent {
  //  int x=98;

    public C02_Child(){

        System.out.println("in child");
    }


    public void childMethod(int x){
        System.out.println(x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }



}
