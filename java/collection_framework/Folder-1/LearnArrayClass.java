
import java.util.Arrays;

public class LearnArrayClass {

    public static void main(String[] args) {

        // arrayclass is basically used for Searching,sorting,convert to arrayList ,check if two arrays are equal or not multiple small operations..
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = Arrays.binarySearch(num, 4);
        System.out.println("index of the value 4 form the num array is : " + index);

        //sorting
        int[] numbers = {1, 3, 2, 5, 4, 9, 6, 8, 7};
        System.out.println("Before sorting ...");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        Arrays.sort(numbers);
        System.out.println("\n After  sorting ...");
        for (int i : numbers) {
            System.out.print(i + " ");
        }

    }

}
