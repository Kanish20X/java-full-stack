
import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        //adding elements in queue...
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println(queue);
        // toreturn and remove a element through poll function
        System.out.println(queue.poll());
        System.out.println(queue);

        // peek is the method to see which element is first...
        System.out.println(queue.peek());

    }

}
