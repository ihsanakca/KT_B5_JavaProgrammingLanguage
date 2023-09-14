package day19_ReturnMethods_Overloading;

public class C07_Initials {
    public static void main(String[] args) {

        initials("Coffee","Lake");
    }



    public static String initials(String firstName, String lastName){
        String result="";
        result = firstName.charAt(0)+"."+lastName.charAt(0)+".";
        return  result;
    }
}

//1. Create a method that can display the initials of the person.    initials(String firstName, String lastName)

//Tugba Karakas T.K.
