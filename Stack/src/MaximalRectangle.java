import java.util.Stack;

public class MaximalRectangle {

    public int maximalRectangle(char[][] matrix) {
        int[] heights = new int[matrix[0].length];
        int maxArea = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix [i][j] == '0')
                    heights[j] = 0;
                else
                    heights[j]++;
            }
            maxArea = Math.max(maxArea, helper(heights));
        }
        return maxArea;
    }

    public int helper(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int height = heights[i];
            while (!st.isEmpty() && heights[st.peek()] > height) {
                int currHeight = heights[st.pop()];
                if (!st.isEmpty()) {
                    maxArea = Math.max(maxArea, currHeight * (i - st.peek() - 1));
                } else {
                    maxArea = Math.max(maxArea, currHeight * i);
                }
            }
            st.push(i);
        }

        while (!st.isEmpty()) {
            int currHeight = heights[st.pop()];
            if (!st.isEmpty()) {
                maxArea = Math.max(maxArea, currHeight * (n - st.peek() - 1));
            } else {
                maxArea = Math.max(maxArea, currHeight * n);
            }
        }
        return maxArea;
    }
}
