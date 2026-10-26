import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveDuplicateAdjII {


    public String removeDuplicates1(String s, int k) {
        Deque<String> st = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!st.isEmpty() && st.peek().charAt(0) == ch) {
                st.push(st.pop() + s.substring(i, i+1));
                if (st.peek().length() == k)
                    st.pop();
            } else {
                st.push(s.substring(i, i+1));
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.removeLast());
        }
        return sb.toString();
    }
}
