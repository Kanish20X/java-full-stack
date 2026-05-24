
import java.util.Arrays;
import java.util.Scanner;

class divisors {

    public static int[] divisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }

        }

        int arr[] = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[index++] = i;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] result = divisors(num);
        System.out.println("an array with divisors of :" + Arrays.toString(result));

    }
}
// optimum approach where we use this Math.log10(num)+1...
