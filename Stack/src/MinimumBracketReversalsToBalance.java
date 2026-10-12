import java.util.Stack;

public class MinimumBracketReversalsToBalance {

    public int countMinReversals(String s) {

        if (s.length() % 2 == 0)
            return -1;

        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        int openCount = 0;
        int closeCount = 0;
        while (!stack.isEmpty()) {
            if (stack.peek() == '}')
                closeCount++;
            else
                openCount++;
            stack.pop();
        }


        if (openCount % 2 == 0) {
            return (openCount/2) + (closeCount/2);
        } else {
            return ((openCount-1)/2) + 2 + ((closeCount-1)/2);
        }
    }

    public int countMinReversals2(String s) {
        if (s.length() % 2 == 1)
            return -1;

        int openCount = 0;
        int closeCount = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '}' && openCount > 0) {
                openCount--;
            } else {
                if (ch == '{')
                    openCount++;
                else
                    closeCount++;
            }
        }

        if (openCount % 2 == 0) {
            return (openCount/2) + (closeCount/2);
        } else {
            return ((openCount-1)/2) + 2 + ((closeCount-1)/2);
        }
    }
}
