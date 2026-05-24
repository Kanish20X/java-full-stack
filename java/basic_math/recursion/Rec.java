
import java.util.Scanner;

// Helper class (non-public)
class solution {

    public void recName(String name, int count, int N) {
        if (count == N) {
            return;
        }
        System.out.println(name);
        recName(name, count + 1, N);
    }
}

// Main class (MUST match filename Rec.java)
public class Rec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ensure you provide inputs in this order: int, String, int
        int c = sc.nextInt();
        String name = sc.next();
        int count = sc.nextInt();

        solution obj = new solution();
        obj.recName(name, c, count);

        sc.close();
    }
}
