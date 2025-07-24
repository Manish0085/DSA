package Questions;

import java.util.Stack;

public class CompareBackspaceStrings
{

    public boolean isEqual(String s, String t) {

        return buildString(s).equals(buildString(t));

    }

    private String buildString(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '#'){
                stack.push(str.charAt(i));
            }
            else if (!stack.isEmpty()){
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            sb.append(stack.get(i));
        }
        return sb.toString();
    }
}
