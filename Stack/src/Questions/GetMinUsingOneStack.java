package Questions;

import java.util.Stack;

public class GetMinUsingOneStack {

    // Here we use 101 many times the reason because in question it is mentioned that the value to be stored in the stack will be
    // 1 <= value <= 100
    // suppose x is 3 then the value in the stack will be stored as 3 * 101 + 3 (assuming the stack is empty) which is 306
    // original value:- 306 / 101 = 3
    // Min value:- 306 % 101 = 3
    Stack<Integer> stack = new Stack<>();

    public void push(int x){
        if(stack.isEmpty()){
            stack.push(x * 101 + x);
        } else {
            stack.push(x * 101 + Math.min(x, stack.peek() % 101));
        }
    }

    public int pop(){
        if (stack.isEmpty()){
            return -1;
        } else {
            return stack.pop() / 101;

        }

    }

    public int getMin(){
        if (stack.isEmpty()){
            return -1;
        }
        return stack.peek() % 101;
    }
}
