package Questions;

import java.util.Stack;

public class StringManipulation {

    public int manipulate(String[] arr){
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()){
                stack.push(arr[i]);
            } else if (arr[i].equals(stack.peek())) {
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }
        return stack.size();
    }
}
