package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeAsQueue {
    public static void main(String... args){
        // Create a Deque snd add elements and its tail using
        // addLast() or offerLast()
        Deque<String> deque = new LinkedList<>();
        deque.addLast("John");
        deque.addLast("Richard");
        deque.addLast("Donna");
        deque.addLast("Ken");

        System.out.println("Deque: " + deque);
        // Let's remove elements from Deque until it is empty
        while (deque.getFirst() != null){
            System.out.println("Head element: " + deque.getFirst());
            deque.removeFirst();
            System.out.println("Remove one element from Deque");
            System.out.println("Deque: " + deque);
        }
    }
}
