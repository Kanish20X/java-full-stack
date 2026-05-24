
import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // Comparator.reverseOrder is used to set a max heap implementation..

        pq.offer(20);
        pq.offer(30);
        pq.offer(10);
        pq.offer(70);
        pq.offer(50);
        System.out.println(pq);
        // PriorityQueue basically implemensts the mini heap so that we can use both peek() method and poll() method to see the top element and element the element...

    }
}
