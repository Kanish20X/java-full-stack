
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollectionClasses {

    public static void main(String[] args) {

        // it is basically used to handle multiple small operations like smallest element ,largest ....frequency..
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(12);
        list.add(76);
        list.add(12);
        list.add(12);

        System.out.println(" Smallest element in the list is : " + Collections.min(list));
        System.out.println(" Largest element in the list is : " + Collections.max(list));
        System.out.println(" number of times an element is repeated  in the list  : +" + Collections.frequency(list, 12));
        System.out.println("before sort : " + list);
        Collections.sort(list); // for reveresOrder we can use (list,Comparator.reveresOrder)

        System.out.println("After sorting : " + list);

    }

}
