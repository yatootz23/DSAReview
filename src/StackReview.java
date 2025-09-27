import java.util.Stack;

public class StackReview {

    public static void main(String[] args) {

        // stack declaration
        Stack<String> stack = new Stack<String>();

        //stack empty check
        System.out.println(stack.empty());

        // stack push
        stack.push("Japan");
        stack.push("Korea");
        stack.push("Taiwan");
        stack.push("Hongkong");
        stack.push("Singapore");
        stack.push("Philippines");

        System.out.println(stack.empty());
        System.out.println(stack);

        // stack peek
        System.out.println(stack.peek());

        // stack search
        System.out.println(stack.search("Japan"));
        System.out.println(stack.search("Thailand"));

        // stack pop
        stack.pop();
        System.out.println(stack);
    }
}
