package Queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueTest {
    public static void main(String... args){
        Queue<String> queue = new LinkedList<>();

        queue.offer("John");
        queue.offer("Richard");
        queue.add("Donna");
        queue.add("Ken");

        System.out.println("Queue: " + queue);

        while (queue.peek() != null){
            System.out.println("Head Element: " + queue.peek());
            queue.remove();
            System.out.println("Removed one element from Queue");
            System.out.println("Queue: " + queue);
        }
        // Now que is empty

        System.out.println("queue.isEmpty: " + queue.isEmpty());

        System.out.println("queue.peek(): " + queue.peek());
        System.out.println("queue.poll(): " + queue.poll());

        try{
            String str = queue.element();
            System.out.println("queue.element(): " + str);
        } catch (NoSuchElementException e){
            System.out.println("queue.element(): Queue is empty.");
        }
        try{
            String str = queue.remove();
            System.out.println("queue.remove(): " + str);
        } catch (NoSuchElementException e){
            System.out.println("queue.remove(): Queue is empty");
        }
    }
}
