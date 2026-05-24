
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        // add elements  to the end of list
        numbers.add(6);
        numbers.add(9);
        // numbers.add.....

        // add elements at the specific index 
        numbers.add(1, 3); // it represnts index and value that is added....
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(5);
        numbers1.add(4);

        // add another list form the existing list
        numbers.addAll(numbers1);
        // to get a element for the list we get method with providing index
        System.out.println(numbers.get(3));

        // to remove a element...
        numbers.remove(3);
        numbers.remove(Integer.valueOf(4));
        // to clear entire list.....list.clear();
        // inorder to update the value in the list we use set....
        numbers.set(0, 0);
        System.out.println(numbers);

        // to check a element present in the list or not is list.contains(num)..
        System.out.println(numbers.contains(3));

        // iteration-1 simple for loop..
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("the element in the list is:" + numbers.get(i));

        }
        int j = 0;
        // iteration 2 for each loop...
        for (int item : numbers) {

            System.out.println("items  " + j + ": " + item);
            j++;
        }

        // iterator 3 using iterator method
        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()) {
            System.out.println("items are :" + it.next());
        }
    }

}
