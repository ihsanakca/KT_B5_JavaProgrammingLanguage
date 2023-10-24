package day44_AbstracClassAndInterface.animal;

public class Eagle extends  Animal implements Wild,CanFly{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

   public void eat(){
       System.out.println(getAge()+" is eating snake");
   }


    @Override
    public void fly() {
        System.out.println(getName()+" is flying at high altitudes");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting a snake");
    }
}
