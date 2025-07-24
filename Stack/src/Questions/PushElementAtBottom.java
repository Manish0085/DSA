package Questions;

import java.util.Stack;

public class PushElementAtBottom {

    public Stack<Integer> pushAtBottom(Stack<Integer> stack, int x){
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()){
            tempStack.push(stack.pop());
        }
        stack.push(x);
        while (!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }
        return stack;
    }
}
