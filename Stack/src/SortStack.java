import java.util.Stack;

public class SortStack {

    public void sortStack(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        dfs(stack, temp);
    }

    public void dfs(Stack<Integer> stack, Stack<Integer> temp) {
        if (stack.isEmpty())
            return;

        int topOfStack = stack.pop();
        if(topOfStack >= stack.peek()) {
            temp.push(topOfStack);
        }
    }
}
