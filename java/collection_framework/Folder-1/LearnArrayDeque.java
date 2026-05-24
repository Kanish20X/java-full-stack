
import java.util.ArrayDeque;

class LearnArrayDeque {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.offerFirst(22);
        adq.offerLast(24);
        adq.offer(23);
        adq.offer(20);

        System.out.println(adq); // similarily we have poll , first and last peekFirst and last....

    }
}
