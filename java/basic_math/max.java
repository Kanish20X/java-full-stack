
import java.util.Scanner;

class max {

    public static int numberOfDigits(int n) {

        int num = n;
        int count = 0;
        while (num > 0) {
            count += 1;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = numberOfDigits(num);
        System.out.println("no of digits in the given num:" + result);

    }
}
// optimum approach where we use this Math.log10(num)+1...
