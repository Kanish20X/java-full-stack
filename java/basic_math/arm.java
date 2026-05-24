
import java.util.Scanner;

class arm {

    public static boolean isArmStrong(int n) {

        int length = String.valueOf(n).length();
        int value = n;
        int armstrong = 0;
        while (n > 0) {
            int num = n % 10;
            armstrong += Math.pow(num, length);
            n /= 10;
        }
        return armstrong == value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean result = isArmStrong(num);

        if (result) {
            System.err.println("It is armstrong number");
        } else {
            System.out.println(" It is not a arm strong number!");
        }
    }
}
// optimum approach where we use this Math.log10(num)+1...
