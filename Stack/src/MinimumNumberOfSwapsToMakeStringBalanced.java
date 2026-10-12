import java.util.Map;
import java.util.Stack;

public class MinimumNumberOfSwapsToMakeStringBalanced {

    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch: s.toCharArray()) {
            if (ch == '[')
                stack.push(ch);
            else {
                if (!stack.isEmpty())
                    stack.pop();
            }

        }
        return (stack.size()+1)/2;
    }

    public int minSwaps2(String s) {
        int openCount = 0;
        int closeCount = 0;
        for (char ch: s.toCharArray()) {
            if (ch == '[')
                openCount++;
            else {
                if (openCount != 0)
                    openCount--;
                else
                    closeCount++;
            }

        }
        return (openCount+1)/2;
    }
}
