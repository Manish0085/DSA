package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class MaxOfMinForEveryWindow {

    // T.C:- O(n*n*n)
    public ArrayList<Integer> minOfMax1(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            ans.add(0);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                int num = Integer.MAX_VALUE;
                for (int k = j; k < j+i+1; k++) {
                    num = Math.min(num, arr[k]);
                }
                ans.set(i, Math.max(ans.get(i), num));
            }
        }
        return ans;
    }


    // T.C:- O(n)
    // S.C:- O(n)
    public ArrayList<Integer> minOfMax2(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            ans.add(0);
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                int index = stack.pop();
                if (stack.isEmpty()){
                    int range = i;
                    ans.set(range-1, Math.max(ans.get(range-1), arr[index]));
                }
                else {
                    int range = i-stack.peek()-1;
                    ans.set(range-1, Math.max(ans.get(range-1), arr[index]));
                }
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            int index = stack.pop();
            if (stack.isEmpty()){
                int range = n;
                ans.set(range-1, Math.max(ans.get(range-1), arr[index]));
            }
            else {
                int range = n-stack.peek()-1;
                ans.set(range-1, Math.max(ans.get(range-1), arr[index]));
            }
        }

        for (int i = n-2; i >= 0; i--) {
            ans.set(i, Math.max(ans.get(i), ans.get(i+1)));
        }
        return ans;
    }



}
