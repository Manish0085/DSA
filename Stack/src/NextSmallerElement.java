import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class NextSmallerElement {

    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = arr.length-1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            ans.add(stack.peek());
            stack.push(arr[i]);
        }

        Collections.reverse(ans);
        return ans;
    }

    static ArrayList<Integer> nextSmallerEle2(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    list.add(arr[j]);
                    break;
                }
            }
            if (list.size() == i)
                list.add(-1);
        }
        return list;
    }
}
