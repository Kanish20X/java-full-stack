
import java.util.HashSet;
import java.util.Set;

public class learnSet {

    public static void main(String[] args) {

        //set has no order .....duplicates are not allowed O(1)
        //Linked HashSet implements same but the things is insertion order is maintained...
        // TreeSet implemenst all the set properities unique ness and and sorted order... O(LOG N)
        Set<Integer> set = new HashSet<>();

        set.add(20);
        set.add(73);
        set.add(24);
        set.add(33);
        System.out.println("elemets " + set);
        set.remove(33);
        System.out.println("elemets " + set);
        System.out.println("Set Size " + set.size());
        System.out.println("Set contains specific element " + set.contains(24));
        set.clear();
        System.out.println("Empty set " + set.isEmpty());

    }

}
