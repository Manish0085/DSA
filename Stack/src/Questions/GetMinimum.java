package Questions;

import java.util.Stack;

public class GetMinimum {


    Stack<Integer> original = new Stack<>();
    Stack<Integer> minValue = new Stack<>();

    public void push(int x){
        if (original.isEmpty()){
            original.push(x);
            minValue.push(x);
        } else {
            original.push(x);
            minValue.push(Math.min(x, minValue.peek()));
        }

    }

    public int pop(){
        if (original.isEmpty()){
            return -1;
        } else {
            minValue.pop();
            return original.pop();

        }

    }

    public int getMin(){
        if (original.isEmpty()){
            return -1;
        }
        return minValue.peek();
    }
}
