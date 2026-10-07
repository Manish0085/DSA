import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {

    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for (char ch: s.toCharArray()) {
            if (ch == '(')
                st.push(ch);
            else {
                if (st.isEmpty()) {
                    count++;
                } else {
                    st.pop();
                }
            }
        }
        return count + st.size();
    }

    public int minAddToMakeValid2(String s) {
        int openCount = 0;
        int closeCount = 0;
        for (char ch: s.toCharArray()) {
            if (ch == '(')
                openCount++;
            else {
                if (openCount == 0) {
                    closeCount++;
                } else {
                    openCount--;
                }
            }
        }
        return closeCount + openCount;
    }
}
