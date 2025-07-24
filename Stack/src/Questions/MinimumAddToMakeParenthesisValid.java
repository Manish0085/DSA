package Questions;

import java.util.Stack;

public class MinimumAddToMakeParenthesisValid {


    public int countAdd1(String str){
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '('){
                stack.push(str.charAt(i));
            }
            else {
                if(stack.isEmpty()){
                    count++;
                }
                else {
                    stack.pop();
                }
            }
        }
        return count + stack.size();
    }

    public int countAdd2(String str){
//        int left = 0;
//        for (int i = 0; i < ; i++) {
//
//        }
        return 0;
    }
}
