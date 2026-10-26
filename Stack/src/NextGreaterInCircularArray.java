import java.util.Stack;

public class NextGreaterInCircularArray {

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums.length];
        for (int i = 2*n-1; i >= 0; i--) {
            int idx = i % n;
            int num = nums[idx];
            while (!st.isEmpty() && st.peek() < num) {
                st.pop();
            }
            ans[idx] = st.isEmpty()? -1: st.peek();
            st.push(num);
        }
        return ans;
    }
}
