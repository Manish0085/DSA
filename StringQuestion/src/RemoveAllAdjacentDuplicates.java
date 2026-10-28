import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class RemoveAllAdjacentDuplicates {

    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch: s.toCharArray()) {
            if (!sb.isEmpty() && ch == sb.charAt(sb.length()-1)) {
                sb.deleteCharAt(sb.length()-1);
            }
            sb.append(ch);
        }

        return sb.toString();
    }

    public String removeDuplicates1(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch: s.toCharArray()) {
            if (!stack.isEmpty() && ch == stack.peek()) {
                stack.pop();
            }
            stack.push(ch);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.removeLast());
        }

        return sb.toString();
    }
}
