package MonotronicStack;

import java.util.Stack;

public class NGOR {

    public int[] nextLargerElement(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length-1; i >= 0; i++) {
            while (!st.isEmpty() && arr[i] >= st.peek()) {
                st.pop();
            }

            ans[i] = st.isEmpty()? -1: st.peek();
            st.push(arr[i]);
        }
        return ans;
    }
}
