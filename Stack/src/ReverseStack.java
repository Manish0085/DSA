import java.util.Stack;

public class ReverseStack {

    public void reverseStack(Stack<Integer> st) {
        dfs(st);
    }

    public void dfs(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int topOfStack = st.pop();
        dfs(st);
        insertAtBottom(st, topOfStack);
    }

    public void insertAtBottom(Stack<Integer> stack, int val) {
        if (stack.isEmpty()) {
            stack.push(val);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack, val);
        stack.push(top);
    }
}
