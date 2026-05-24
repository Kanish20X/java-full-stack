
import java.util.Scanner;

public class palinCheck {

    public static boolean palinCheck(int indx, String s) {
        // we will conclude if we compared half of the string that is palindrome
        if (indx >= s.length() / 2) {
            return true;
        }

        if (s.charAt(indx) != s.charAt(s.length() - indx - 1)) {
            return false;
        }

        return palinCheck(indx + 1, s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        String result = palinCheck(0, str) ? "String is a palindrome" : "String is not a palindrome";

        System.out.println(result);

    }
}
