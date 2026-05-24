
import java.util.Scanner;

class merge {

    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void conquer(int arr[], int si, int mid, int ei) {

        int[] merged_array = new int[ei - si + 1];
        int index_right_array = si;
        int index_left_array = mid + 1;
        int merged_array_index = 0;
        while (index_right_array <= mid && index_left_array <= ei) {
            if (arr[index_right_array] <= arr[index_left_array]) {
                merged_array[merged_array_index++] = arr[index_right_array++];
            } else {
                merged_array[merged_array_index++] = arr[index_left_array++];

            }
        }
        while (index_right_array <= mid) {
            merged_array[merged_array_index++] = arr[index_right_array++];

        }
        while (index_left_array <= ei) {
            merged_array[merged_array_index++] = arr[index_left_array++];
        }

        for (int k = 0; k < merged_array.length; k++) {
            arr[si + k] = merged_array[k];
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

        divide(array, 0, n - 1);

        for (int k : array) {
            System.out.print(k + " ");
        }

    }
}
