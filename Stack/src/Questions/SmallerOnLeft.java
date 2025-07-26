package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class SmallerOnLeft {

    // T.C = O(n*n)
    public int[] SOL1(int[] arr){
        int[] ans = new int[arr.length];
        Arrays.fill(ans, -1);
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = i-1; j >= 0 ; j--) {
                if (arr[i] > arr[j]){
                    ans[i] = ans[j];
                    break;
                }
            }
        }
        return ans;
    }

    public int[] SOL2(int[] arr){
        int[] ans = new int[arr.length];
        Arrays.fill(ans, -1);

        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length-1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        return ans;
    }



}
