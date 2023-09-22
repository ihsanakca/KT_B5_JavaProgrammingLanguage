package day25_Week05_Review;

public class C09_Empty {

    public static void main(String[] args) {
        /*
        Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

        ali---> ali
        ak----->ak
        ankara----> ara
        ""----> empty

         */

        String s1= "";

        if(s1.length()==0){
            System.out.println("empty");

        }else if(s1.length()>3){

            System.out.println(s1.substring(s1.length() - 3));
        }
        else{
            System.out.println(s1);
        }


    }
}
