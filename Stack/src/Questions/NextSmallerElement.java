package Questions;

import java.util.ArrayList;
import java.util.Stack;

public class NextSmallerElement {


    // This is for array not for circular array
    // T.C-> O(n*n)
    // S.C-> O(1)
    public ArrayList<Integer> NSM1(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            ans.add(-1);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    ans.set(i, arr[j]);
                    break;
                }
            }
        }
        return ans;
    }



    public ArrayList<Integer> NSE2(int[] arr){

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            ans.add(-1);
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()){
                stack.push(i);
            } else {
                while (!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                    ans.set(stack.pop(), arr[i]);
                }
                stack.push(i);
            }
        }
        return ans;

    }
}
