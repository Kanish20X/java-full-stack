
import java.util.Scanner;

public class RevArray {

    public static void ReverseArray(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        ReverseArray(arr, left + 1, right - 1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int arr[] = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("original array:");
        for (int m : arr) {
            System.out.print(m + ", ");
        }

        ReverseArray(arr, 0, sizeOfArray - 1);
        System.out.println("\nReveres array: \n");
        System.out.print("[ ");
        for (int n : arr) {
            System.out.print(n + ",");
        }
        System.out.print("] ");

    }

}
