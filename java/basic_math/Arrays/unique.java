
import java.util.HashSet;
import java.util.Scanner;

class unique {

    public static int UniqueIndex(int arr[]) {
        int index = 0;

        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {

            if (!seen.contains(num)) {

                seen.add(num);

                arr[index++] = num;

            }
        }
        return index;

    }
    public static void unique_index(int arr[]){
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int k = UniqueIndex(array);
        for (int j = 0; j < k; j++) {
            System.out.print(array[j] + " ");
        }

    }
}
