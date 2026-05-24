
import java.util.Scanner;

class CheckSort {

    public static boolean checksort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        String result = (checksort(array) ? "array is sorted" : "array is unsorted");
        System.out.println(result);

    }
}
