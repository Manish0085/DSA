import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for (int i=s.length()-1; i>=0; i--) {
            char ch = s.charAt(i);
            if (!st.isEmpty() && ch == st.peek()) {
                st.pop();
            } else {
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.toString();
    }

    public String removeDuplicates2(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch: s.toCharArray()) {
            if (!sb.isEmpty() && ch == sb.charAt(sb.length()-1)) {
                sb.deleteCharAt(sb.length()-1);
            } else {
                sb.append(ch);
            }
        }


        return sb.toString();
    }
}
