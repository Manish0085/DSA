import java.util.Stack;

public class InsertAtBottom {

    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        dfs(st, x);
        return st;
    }

    public void dfs(Stack<Integer> st1, int x) {
        if (st1.isEmpty()) {
            st1.push(x);
            return;
        }

        int pop = st1.pop();
        dfs(st1, x);
        st1.push(pop);
    }
}
