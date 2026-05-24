
import java.util.Scanner;

class SecondLargestSmallest {

    public static int second_largest(int arr[]) {
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > large) {
                secondLarge = large;
                large = x;
            } else if (x > secondLarge && x != large) {
                secondLarge = x;
            }
        }
        return secondLarge;

    }

    public static int second_smallest(int arr[]) {
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        for (int x : arr) {
            if (x < small) {
                secondSmall = small;
                small = x;
            } else if (x < secondSmall && x != small) {
                secondSmall = x;
            }
        }
        return secondSmall;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int secondmax = second_largest(array);
        int secondmin = second_smallest(array);
        System.out.println(" second Largest number from the given array: " + secondmax);
        System.out.println(" second smallest number from the given array: " + secondmin);

    }
}
