
import java.util.Scanner;

class Bubble {

    public static int[] sortArray(int[] arr) {
        int length = arr.length;
        int temp = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        return arr;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int array[] = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array before sorting:\n");
        for (int m : array) {
            System.out.print(m + " ");
        }

        System.out.println("\nArray after sorting:");

        sortArray(array);

        for (int n : array) {
            System.out.print(n + " ");
        }

    }
}
