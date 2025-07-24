package Questions;

import java.util.Stack;

public class ValidParenthesis {


    // for same type of brackets
    public static boolean isValid1(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '('){
                stack.push(ch);
            }
            else {
                if (stack.isEmpty()){
                    return false;
                }
                if(str.charAt(i) == ')' && stack.peek() == '(') {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        return str.isEmpty();
    }


    // For type of brackets also
    public static boolean isValid2(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else {
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                if((str.charAt(i) == ')' && top == '(') ||
                        (str.charAt(i) == '}' && top == '{') ||
                        (str.charAt(i) == ']' && top == '[')) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        return str.isEmpty();
    }

    public boolean isValid3(String str){
        int left = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '('){
                left++;
            } else{
                if (left == 0){
                    return false;

                }
                else {
                    left--;
                }
            }
        }
        return left==0;
    }


    public static void main(String[] args) {
        System.out.println(isValid1("(()()"));;
    }
}
