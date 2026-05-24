
import java.util.Scanner;

class gcd {

    public static int gcd(int n1, int n2) {

        int gcd = 1;
        for (int i = 1; i < n1 && i < n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }

        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = gcd(num1, num2);
        System.out.println("gcd of " + num1 + " and " + num2 + " is :" + result);

    }
}
