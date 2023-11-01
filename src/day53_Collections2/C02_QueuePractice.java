package day53_Collections2;

import java.util.*;

public class C02_QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> priorityQue = new PriorityQueue<>();
        priorityQue.addAll(Arrays.asList(52,1,13,14,6,753,6,7,900,0));  // random order
        System.out.println("priorityQue = " + priorityQue);
        priorityQue.add(18);
        priorityQue.add(5);
        System.out.println("priorityQue = " + priorityQue);

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(52,1,13,14,6,753,6,7,900,0));  // preserve insertion order
        System.out.println("arrayDeque = " + arrayDeque);
        arrayDeque.add(18);
        arrayDeque.add(5);
        System.out.println("arrayDeque = " + arrayDeque);

        Queue<Integer> linkedlist = new LinkedList<>();
        linkedlist.addAll(Arrays.asList(52,1,13,14,6,753,6,7,900,0));  // preserve insertion order
        System.out.println("linkedlist = " + linkedlist);
        linkedlist.add(18);
        linkedlist.add(5);
        System.out.println("linkedlist = " + linkedlist);
        System.out.println("------------------------------");

//        priorityQue.get(1)   QUEUE index yok
//        arrayDeque.get(0)
        System.out.println("((List)(linkedlist)).get(2) = " + ((List) (linkedlist)).get(2));
        System.out.println("priorityQue = " + priorityQue);
        System.out.println("priorityQue.peek() = " + priorityQue.peek());
        System.out.println("priorityQue = " + priorityQue);
        System.out.println("priorityQue.poll() = " + priorityQue.poll());
        System.out.println("priorityQue = " + priorityQue);


        System.out.println("------------------------------");
        System.out.println("arrayDeque = " + arrayDeque);
        System.out.println("arrayDeque.peek() = " + arrayDeque.peek());
        System.out.println("arrayDeque = " + arrayDeque);
        System.out.println("arrayDeque.poll() = " + arrayDeque.poll());
        System.out.println("arrayDeque = " + arrayDeque);

        System.out.println("------------------------------");
        System.out.println("linkedlist = " + linkedlist);
        System.out.println("linkedlist.poll() = " + linkedlist.poll());
        System.out.println("linkedlist = " + linkedlist);

//        ((List)(priorityQue)).get(0);//ClassCastException

    }
}
