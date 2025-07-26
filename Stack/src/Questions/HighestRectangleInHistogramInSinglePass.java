package Questions;

import java.util.Stack;

public class HighestRectangleInHistogramInSinglePass {


    public static int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                int index = stack.pop();
                if (!stack.isEmpty()) {
                    ans = Math.max(ans, heights[index] * (i - stack.peek() - 1));
                } else {
                    ans = Math.max(ans, heights[index] * i);
                }
            }
            stack.push(i);
        }

            while (!stack.isEmpty()) {
                int index = stack.pop();
                if (!stack.isEmpty()) {
                    ans = Math.max(ans, heights[index] * (heights.length - stack.peek() - 1));
                } else {
                    ans = Math.max(ans, heights[index] * heights.length);
                }
            }


            System.out.println(ans);
            return ans;


    }



    public static void main(String[] args) {
        largestRectangleArea(new int[]{2, 3, 4, 2, 6, 5, 4, 5, 3});
    }


}
