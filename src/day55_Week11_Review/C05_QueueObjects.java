package day55_Week11_Review;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C05_QueueObjects {

    public static void main(String[] args) {

        /*
        Queue (I): duplicates are allowed, does not have index number. FIFO , does not accept null

							poll() ===> FIFO

						PriorityQueue (C): random/natural order
						ArrayDequeue (C): insertion order

						LinkedList (C):  insertion order


         */

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(10);
        queue.add(3);
        queue.add(8);
        queue.add(2);
        //queue.add(null);
        System.out.println(queue);

        System.out.println("queue.peek() = " + queue.peek()); // head/ en baştakini veriyor
        queue.poll(); // en baştakini çıkarıyor
        System.out.println(queue);

        System.out.println("queue.peek() = " + queue.peek());
        queue.poll();
        System.out.println(queue);


        System.out.println("--------------------");

        Queue<Integer> queue2 = new ArrayDeque<>(); //insertion order
        queue2.add(2);
        queue2.add(10);
        queue2.add(3);
        queue2.add(8);
        queue2.add(2);
        //queue.add(null);
        System.out.println(queue2);

        /*
        add() will throw an IllegalStateException if no space is currently available in the Queue, otherwise add method will return true.
        offer() method will return false if the element cannot be inserted due to capacity restrictions.
         */

        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.offer("java"); // ekliyor
        deque.offer("javaScript");
        deque.offer("ruby");

        System.out.println(deque);
        System.out.println("deque.peek() = " + deque.peek());
        deque.poll();
        System.out.println(deque);

        deque.offerFirst("C#");
        System.out.println(deque);

        deque.offerLast("C++");
        System.out.println(deque);

        deque.pollFirst();
        System.out.println(deque);

        deque.pollLast();
        System.out.println(deque);

        //deque.remove();
        deque.poll();
        System.out.println(deque);

        deque.remove();
        System.out.println(deque);
        //deque.remove();--> exception
        System.out.println("deque.poll() = " + deque.poll()); // ---> returns null


    }


}
