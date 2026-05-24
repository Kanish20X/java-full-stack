
import java.util.*;

public class functions {

    public static long mul(long val, long pow) {

        return (long) Math.pow(val, pow);

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        System.out.print("Enter power: ");
        int power = scan.nextInt();
        long result = mul(num, power);
        System.out.println("The result is: " + result);
        scan.close();

    }
}
