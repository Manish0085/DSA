package Questions;

import java.util.ArrayList;
import java.util.Stack;

public class MakeArrayBeautiful {

    public static ArrayList<Integer> makeBeautiful(int[] arr){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()){
                stack.push(arr[i]);
            } else if ((arr[i] >=0 && stack.peek() < 0) || (arr[i] < 0 && stack.peek() >= 0)) {
                stack.pop();
            }
            else {
                stack.push(arr[i]);
            }
        }
        return new ArrayList<>(stack);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = makeBeautiful(new int[]{2, 3, 5, -4, 6, -2, -8, 9});
        System.out.println(list);
    }
}
