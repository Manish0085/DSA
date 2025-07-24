package Questions;

import java.util.Map;
import java.util.Stack;

public class PrintMinOfStackWhilePoppingTopEl {


    public Stack<Integer> push(int[] arr){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0){
                stack.push(arr[i]);
            }
            else {
                stack.push(Math.min(arr[i], stack.peek()));
            }
        }
        return stack;
    }

    public void getMin(Stack<Integer> stack){
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
