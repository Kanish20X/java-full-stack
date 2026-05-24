
import java.util.Scanner;

class QuickSort {

    public static int Partition(int[] arr, int low, int high) {
        int positioning = low - 1;
        int pivot = arr[high];

        for (int i = low; i < high; i++) {
            if (arr[i] < pivot) {
                positioning++;
                int temp = arr[positioning];
                arr[positioning] = arr[i];
                arr[i] = temp;
            }
        }
        positioning++;
        int temp = arr[positioning];
        arr[positioning] = pivot;
        arr[high] = temp;
        return positioning;
    }

    public static void quick_sort(int arr[], int low, int high) {
        if (low < high) {
            int pindx = Partition(arr, low, high);
            quick_sort(arr, low, pindx - 1);
            quick_sort(arr, pindx + 1, high);

        }
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

        quick_sort(array, 0, n - 1);
        for (int k : array) {
            System.out.print(k + " ");
        }

    }
}
