
import java.util.*;

public class Mergesort {

    public static void conquer(int[] arr, int si, int mid, int ei) {
        int p1 = si;
        int p2 = mid + 1;
        int k = 0;
        int[] sorted = new int[ei - si + 1];

        while (p1 <= mid && p2 <= ei) {
            if (arr[p1] < arr[p2]) {
                sorted[k++] = arr[p1++];

            } else {
                sorted[k++] = arr[p2++];
            }
        }
        while (p1 <= mid) {
            sorted[k++] = arr[p1++];
        }
        while (p2 <= ei) {
            sorted[k++] = arr[p2++];
        }
        for (int i = 0; i < sorted.length; i++) {
            arr[si + i] = sorted[i];
        }

    }

    public static void divide(int[] arr, int si, int ei) {

        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);

        divide(arr, mid + 1, ei);

        conquer(arr, si, mid, ei);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("unsorted array:");
        for (int i = 0; i < 5; i++) {
            System.out.print(nums[i] + " ");
        }
        divide(nums, 0, nums.length - 1);
        System.out.println("\n sorted array is:");
        for (int i = 0; i < 5; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
