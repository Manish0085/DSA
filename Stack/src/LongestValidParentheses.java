import java.util.Stack;

public class LongestValidParentheses {

    public int longestValidParentheses(String s) {

        Stack<Integer> st = new Stack<>();
        int i=0;
        for (char ch: s.toCharArray()) {

        }
        return s.length() - st.size();
    }
}
