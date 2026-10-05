import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int idx = 0;
        while (idx < s.length()) {
            char ch = s.charAt(idx);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else  {
                if (st.isEmpty())
                    return false;
                if((st.peek() == '(' && ch == ')') || (st.peek() == '{' && ch == '}') || (st.peek() == '[' && ch == ']') )
                    st.pop();
                else
                    return false;
            }
            idx++;
        }
        return st.isEmpty();
    }
}
