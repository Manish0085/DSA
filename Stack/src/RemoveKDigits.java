import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveKDigits {

    public String removeKDigits(String num, int k) {
        if (num.length() == k) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : num.toCharArray()) {
            while (!sb.isEmpty() && k > 0 && sb.charAt(sb.length()-1) > ch) {
                sb.deleteCharAt(sb.length()-1);
                k--;
            }
            sb.append(ch);
        }

        while (k-- > 0) {
            sb.deleteCharAt(sb.length()-1);
        }

        while (!sb.isEmpty() && sb.charAt(0) == '0')
            sb.deleteCharAt(0);

        return sb.length() == 0? "0": sb.toString();
    }
    public String removeKDigits1(String num, int k) {
        if (num.length() == k) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        Deque<Character> st = new ArrayDeque<>();
        for (char ch : num.toCharArray()) {
            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }
            st.push(ch);
        }

        while (k-- > 0) {
            st.pop();
        }

        while (!st.isEmpty()) {
            sb.append(st.removeLast());
        }

        while (!sb.isEmpty() && sb.charAt(0) == '0')
            sb.deleteCharAt(0);

        return sb.length() == 0? "0": sb.toString();
    }
}
