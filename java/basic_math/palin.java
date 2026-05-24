
import java.util.Scanner;

class palin {

    public static int palin(int n) {

        int revNum = 0;
        int val = n;
        while (n > 0) {
            int num = n % 10;
            revNum = revNum * 10 + num;
            n /= 10;
        }
        if (revNum == val) {
            return revNum;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = palin(num);

        String finalResult = result == 0 ? "It is not a palindrome" : "It is a palindorme";

        System.out.println(finalResult);

    }
}
