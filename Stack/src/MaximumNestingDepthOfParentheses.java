import java.util.Stack;

public class MaximumNestingDepthOfParentheses {

    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int ans = 0;
        for (char ch: s.toCharArray()) {
            if (ch == '(')
                stack.push(ch);
            else if(ch == ')') {
                ans = Math.max(ans, stack.size());
                stack.pop();
            }
            else {
                continue;
            }
        }
        StringBuilder str = new StringBuilder();

        return ans;
    }

    public int maxDepth2(String s) {
        Stack<Character> stack = new Stack<>();
        int ans = 0;
        int openCount = 0;
        int closeCount = 0;
        for (char ch: s.toCharArray()) {
            if (ch == '(')
                openCount++;
            else if(ch == ')') {
                ans = Math.max(ans, openCount);
                openCount--;
            }
            else {
                continue;
            }
        }
        return ans;
    }
}
