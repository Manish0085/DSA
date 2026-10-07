import java.util.Stack;

public class DetermineIfStringValid {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch: s.toCharArray()) {
            if (ch == 'a' || ch == 'b')
                stack.push(ch);
            else {
                if (stack.size() < 2)
                    return false;
                char firstTop = stack.pop();
                char secondTop = stack.pop();
                if(firstTop != 'a' || secondTop != 'b')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
