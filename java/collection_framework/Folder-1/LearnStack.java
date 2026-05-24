
import java.util.Stack;

public class LearnStack {

    public static void main(String[] args) {

        Stack<String> animals = new Stack<>();
        animals.push("lion");
        animals.push("tiger");
        animals.push("Elephants");
        System.out.println("stack elements : " + animals);
        System.out.println("stack 1st elements : " + animals.peek());

    }
}
