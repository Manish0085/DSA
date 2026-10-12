import java.util.Stack;

public class DecodeString {

    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char ch: s.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch);
            } else {
                if ()
            }
        }
    }
}
