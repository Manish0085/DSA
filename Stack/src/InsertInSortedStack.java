import java.util.Stack;

public class InsertInSortedStack {

    public static void insert(Stack<Integer> stack, int x) {
        if (stack.isEmpty() || stack.peek() <= x) {
            stack.push(x);
            return;
        }

        int topOfStack = stack.pop();
        insert(stack, x);
        stack.push(topOfStack);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Before: " + stack);

        insert(stack, 2);

        System.out.println("After:  " + stack);
    }
}
