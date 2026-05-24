
import java.util.Scanner;

public class Fact {

    public static int FactorialOfNumber(int n) {
        if (n == 1) {
            return 1;
        }
        return n * FactorialOfNumber(n - 1);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int Fact = FactorialOfNumber(num);
        System.out.println("Factorial Of :" + num + " : " + Fact);

    }
}
