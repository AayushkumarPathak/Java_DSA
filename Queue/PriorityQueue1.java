import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3); // O(log n) n -> no. of elements already existing in the queue.
        pq.add(4);
        pq.add(1);
        pq.add(6);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
        // reverseing the queue;
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        q.add(3);
        q.add(4);
        q.add(1);
        q.add(7);

        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}