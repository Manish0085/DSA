import java.util.Stack;

public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {

        int temp1 = s.length()-1;
        int temp2 = t.length()-1;

        while (temp1 >= 0 && temp2 >= 0) {
            if (s.charAt(temp1) != '#' && t.charAt(temp2) != '#' && s.charAt(temp1) == t.charAt(temp2)) {
                temp1--;
                temp2--;
            }

            else {
                if (s.charAt(temp1) == '#')
                    temp1 -= 2;
                else
                    temp1--;

                if (t.charAt(temp2) == '#')
                    temp2 -= 2;
                else
                    temp2--;

                if (s.charAt(temp1) != t.charAt(temp2))
                    return false;
            }
        }
        return true;

    }
    public boolean backspaceCompare2(String s, String t) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int temp1 = 0;
        int temp2 = 0;
        while (temp1  < s.length() || temp2 < t.length()) {
            if(temp1 < s.length()) {
                if (Character.isLetter(s.charAt(temp1))) {
                    sb1.append(s.charAt(temp1));
                } else {
                    if (!sb1.isEmpty())
                        sb1.deleteCharAt(sb1.length()-1);
                }
                temp1++;
            }
            if (temp2 < t.length()) {
                if (Character.isLetter(t.charAt(temp2))) {
                    sb2.append(t.charAt(temp2));
                } else {
                    if (!sb2.isEmpty())
                        sb2.deleteCharAt(sb2.length()-1);
                }
                temp2++;
            }

        }
        return sb1.toString().equals(sb2.toString());

    }
    public boolean backspaceCompare1(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        for (Character ch : s.toCharArray()) {
            if (Character.isLetter(ch))
                stack1.push(ch);
            else{
                if (!stack1.isEmpty()){
                    stack1.pop();
                }
            }
        }
        Stack<Character> stack2 = new Stack<>();
        for (Character ch : t.toCharArray()) {
            if (Character.isLetter(ch))
                stack2.push(ch);
            else {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            }
        }

        if (stack1.size() != stack2.size())
            return false;


        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            if (stack1.pop() != stack2.pop())
                return false;
        }

        return true;

    }

}
