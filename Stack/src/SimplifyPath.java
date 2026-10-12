import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class SimplifyPath {

    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] paths = path.split("/");
        for (String str: paths) {
            if ("/".equals(str) || ".".equals(str) || "".equals(str) || (stack.isEmpty() && "..".equals(str)))
                continue;
            else if (!stack.isEmpty() && "..".equals(str)) {
                stack.pop();
            }
            else {
                stack.push(str);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append("/");
            stringBuilder.append(stack.firstElement());
            stack.remove(0);
        }
        if (stringBuilder.isEmpty()) {
            return "/";
        }
        return stringBuilder.toString();
    }

    public String simplifyPath2(String path) {
        Deque<String> stack = new ArrayDeque<>();
        for (String str: path.split("/")) {
            if (".".equals(str) || "".equals(str)) {
                continue;
            }
            if (str.equals("..")) {
                if (!stack.isEmpty())
                    stack.pop();
            } else {
                stack.push(str);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append("/").append(stack.removeLast());
        }

        return sb.length() == 0? "/": sb.toString();
    }
}
