
import java.util.*;

public class IFELSE {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long value = scan.nextLong();
        scan.close();
        int count = 0;
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                count++;
            } else {
                continue;
            }

        }
        if (count == 2) {
            System.out.println("YES, the given number is a prime number");
        } else {
            System.out.println("NO, the given number is not a prime number");
        }

    }

}
