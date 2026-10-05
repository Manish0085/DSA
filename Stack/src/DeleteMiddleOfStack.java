import java.util.Stack;

public class DeleteMiddleOfStack {

    public void deleteMid(Stack<Integer> s) {
        dfs(s, 0, s.size());
    }

    public void dfs(Stack<Integer> st, int count, int size) {
        if(count == size/2) {
            st.pop();
            return;
        }

        int stackTop = st.pop();
        dfs(st, ++count, size);
        st.push(stackTop);
    }
}
