import java.util.Stack;

public class CheckIsStackSorted {

    public boolean isSorted(Stack<Integer> stack) {
        return dfs(stack);
    }

    public static boolean dfs(Stack<Integer> stack) {
        if (stack.size() <= 1)
            return true;

        int topOfStack = stack.pop();
        if (topOfStack < stack.peek()) {
            stack.push(topOfStack);
            return false;
        }

        boolean result = dfs(stack);
        stack.push(topOfStack);
        return result;
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(5);
        s1.push(4);
        s1.push(3);
        s1.push(2);
        s1.push(1);       // Sorted
        System.out.println("Stack1: " + dfs(s1));
        Stack<Integer> s2 = new Stack<>();
        s2.push(1);
        s2.push(2);
        s2.push(3);
        s2.push(4);
        s2.push(5);       // Not sorted
        System.out.println("Stack2: " + dfs(s2));

        Stack<Integer> s3 = new Stack<>();
        s3.push(3);       // Single element → Sorted
        System.out.println("Stack2: " + dfs(s3));

        Stack<Integer> s4 = new Stack<>();
        s4.push(3);
        s4.push(3);
        s4.push(2);
        s4.push(1);       // Sorted
        System.out.println("Stack4: " + dfs(s4));

        Stack<Integer> s5 = new Stack<>();
        s5.push(1);
        s5.push(2);
        s5.push(4);
        s5.push(3);       // Not sorted
        System.out.println("Stack5: " + dfs(s5));
    }
}
