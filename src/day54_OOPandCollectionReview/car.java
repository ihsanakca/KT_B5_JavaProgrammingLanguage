package day54_OOPandCollectionReview;

public abstract class car {

    public abstract void drive();
}


abstract class Honda extends car{



}



class CRV extends Honda{
    public void drive(){
        System.out.println("Güzel çalışır");
    }

    public void fuel(){
        System.out.println("Dizel ile çalışır");
    }


}


class Jazz extends Honda{
    public void drive(){
        System.out.println("Yavaş çalışır");
    }
    public void fuel(){
        System.out.println("Benzin ile çalışır");
    }

}




// Honda myHonda=new CRV();   --Concrete
// Honda myHonda=new Jazz();   --Concrete