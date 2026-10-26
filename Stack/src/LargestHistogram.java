import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.Stack;

public class LargestHistogram {

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            while (!st.isEmpty() && heights[i] < height) {
                int currHeight = heights[st.peek()];
                int NSR = i;
                int NSL = st.isEmpty()? -1: st.pop();
                maxArea = Math.max(maxArea, NSR - NSL - 1);

            }
            st.push(i);
        }
        return maxArea;
    }
    public void nextSmallerRight(int[] heights, int NSR[]) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            int num = heights[i];
            while (!st.isEmpty() && heights[st.peek()] > num) {
                NSR[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }


        while (!st.isEmpty()) {
            NSR[st.pop()] = n;
        }
    }

    public void nextSmallerLeft(int[] heights, int NSL[]) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            int num = heights[i];
            while (!st.isEmpty() && heights[st.peek()] > num) {
                st.pop();
            }
            NSL[i] = st.isEmpty()? -1: st.peek();
            st.push(i);
        }
    }
    public int largestRectangleArea1(int[] heights) {
        int[] NSR = new int[heights.length];
        int[] NSL = new int[heights.length];
        nextSmallerLeft(heights, NSL);
        nextSmallerRight(heights, NSR);

        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int width = NSR[i] - NSL[i] - 1;
            maxArea = Math.max(maxArea, width * heights[i]);
        }
        return maxArea;
    }
}
