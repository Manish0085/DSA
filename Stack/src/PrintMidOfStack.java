import java.util.Stack;

public class PrintMidOfStack {

    public void printMid(Stack<Integer> s) {
        int size = s.size();
        int count = 0;
        while(count < size/2) {
            s.pop();
            count++;
        }
        System.out.println(s.peek());
    }

    public void recursion(Stack<Integer> s, int size, int count) {
        if(count == size/2) {
            System.out.println(s.peek());
            return;
        }
        s.pop();
        recursion(s, size, count++);
    }
}
