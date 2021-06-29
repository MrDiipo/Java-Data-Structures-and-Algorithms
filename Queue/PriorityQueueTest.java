package Queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class PriorityQueueTest {
    public static void main(String[] args){
        Queue<ComparablePerson> pq = new PriorityQueue<>();
        pq.add(new ComparablePerson(1, "John"));
        pq.add(new ComparablePerson(4, "Ken"));
        pq.add(new ComparablePerson(2, "Richard"));
        pq.add(new ComparablePerson(3, "Donna"));
        pq.add(new ComparablePerson(4, "Adam"));

        System.out.println("Priority queue: " + pq);

        while (pq.peek() != null){
            System.out.println("Head element: " + pq.peek());
            pq.remove();
            System.out.println("Removed one element from the queue");
            System.out.println("Priority queue: " + pq);

        }
    }
}
