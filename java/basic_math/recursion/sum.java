
import java.util.Scanner;

public class sum {

    public static int sumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNaturalNumbers(n - 1);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int sumOfNumbers = sumOfNaturalNumbers(num);
        System.out.println("Sum of the numbers:" + sumOfNumbers);

    }
}
