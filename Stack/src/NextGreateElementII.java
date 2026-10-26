import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreateElementII {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[nums1.length];
        Stack<Integer> st = new Stack<>();
        for (int i= nums2.length-1; i >= 0; i--) {
            int num = nums2[i];
            while (!st.isEmpty() && st.peek() < num) {
                st.pop();
            }
            map.put(num, st.isEmpty()? -1: st.peek());
            st.push(num);
        }

        int idx = 0;
        for (int num: nums1) {
            ans[idx++] = map.containsKey(num)? map.get(num): -1;
        }
        return ans;
    }
}
