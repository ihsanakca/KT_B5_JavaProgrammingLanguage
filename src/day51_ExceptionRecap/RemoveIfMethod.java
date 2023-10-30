package day51_ExceptionRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list);

        for(int i=0; i<list.size();i++){
            if(list.get(i) %2 ==0){
                list.remove(i);
            }
        }

        System.out.println(list);

        System.out.println("------------------------");

        //java8 : lambda expression  p ->

        ArrayList<Integer> list2= new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));

        list2.removeIf(each -> each %2==0);

        System.out.println(list2);

        System.out.println("--------------------------");

        ArrayList<Integer> list3= new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));

        list3.removeIf(p-> p<5);

        System.out.println(list3);

        ArrayList<String> names= new ArrayList<>();
        names.addAll(Arrays.asList("Ahmet","Ali","Hakan","Başak","Arzu"));

        names.removeIf(name->name.startsWith("A"));

        System.out.println(names);





    }

}
