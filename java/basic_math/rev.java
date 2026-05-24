
import java.util.Scanner;

class rev {

    public static int revOfDigits(int n) {

        int revNum = 0;
        while (n > 0) {
            int num = n % 10;
            revNum = revNum * 10 + num;
            n /= 10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = revOfDigits(num);
        System.out.println("reverse of digit :" + result);

    }
}
// optimum approach where we use this Math.log10(num)+1...
