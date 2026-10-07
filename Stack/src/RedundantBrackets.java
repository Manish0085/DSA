import java.util.Stack;

public class RedundantBrackets {

    public boolean checkRedundancy(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                stack.push(ch);
            }
            else if (ch == ')'){
                boolean flag = false;
                while (stack.peek() != '(') {
                    if (stack.peek() == '+' || stack.peek() == '-' || stack.peek() == '/' || stack.peek() == '*') {
                        flag = true;
                    }
                    stack.pop();
                }
                stack.pop();
                if (!flag)
                    return true;
            }
        }
        return false;
    }
}
