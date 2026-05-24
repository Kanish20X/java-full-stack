
import java.util.Scanner;

class selection {

    public static int[] sortArray(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;

                }

            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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
