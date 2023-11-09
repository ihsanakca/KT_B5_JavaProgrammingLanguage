package day59_JavaReview2.iterating;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C07_ListIterator {

    public static void main(String[] args) {

        List<String> countries = Arrays.asList("Germany","UK","Australia");

        ListIterator<String> listIterator= countries.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("--------------------------------");

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }



    }
}
