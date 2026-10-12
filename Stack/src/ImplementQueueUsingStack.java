import java.util.Stack;

public class ImplementQueueUsingStack {

    Stack<Integer> st1;
    Stack<Integer> st2;
    public ImplementQueueUsingStack() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x) {
        if (st1.empty())
            st1.push(x);
        else {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
            st1.push(x);
            while (!st2.empty()) {
                st1.push(st2.pop());
            }
        }
    }

    public int pop() {
        if (st1.isEmpty())
            return -1;
        return st1.pop();
    }

    public int peek() {
        return st1.peek();
    }

    public boolean empty() {
        return st1.empty();
    }
}
