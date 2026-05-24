
import java.util.Scanner;

class Insertion {

    public static int[] sortArray(int[] arr) {
        int length = arr.length;

        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        return arr;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Array before sorting:\n");
        for (int m : array) {
            System.out.print(m + " ");
        }

        System.out.println("\nArray after sorting:");

        sortArray(array);

        for (int k : array) {
            System.out.print(k + " ");
        }

    }
}
