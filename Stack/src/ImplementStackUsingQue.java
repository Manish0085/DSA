import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQue {

    Queue<Integer> que1;
    Queue<Integer> que2;

    public ImplementStackUsingQue() {
        que1 = new LinkedList<>();
        que2 = new LinkedList<>();
    }

    public void push(int x) {
        if (que1.isEmpty()){
            que1.offer(x);
        } else {
            while (!que1.isEmpty()) {
                que2.offer(que1.poll());
            }
            que1.offer(x);
            while (!que2.isEmpty()) {
                que1.offer(que2.poll());
            }
        }
    }

    public int pop() {
        if(que1.isEmpty())
            return -1;
        else
            return que1.poll();
    }

    public int top() {
        return que1.peek();
    }

    public boolean empty() {
        return que1.isEmpty();
    }
}
