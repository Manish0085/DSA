package Questions;

import java.util.Stack;

public class MaximalRectangle {


    public int maximalRectangle(char[][] matrix) {
        int raw = matrix.length;
        int col = matrix[0].length;
        int ans = 0;
        int[] height = new int[col];
        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < col; j++) {
                height[j] = (matrix[i][j] == '0')? 0: height[j] + 1;
            }
            ans = Math.max(ans, largestRectangleArea(height));
        }
        return ans;
    }


    private int largestRectangleArea(int[] height){
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[stack.peek()] > height[i]){
                int index = stack.pop();
                if (!stack.isEmpty()){
                    ans = Math.max(ans, height[index] * (i - stack.peek() - 1));
                }
                else {
                    ans = Math.max(ans, height[index] * i);
                }
            }
            stack.push(i);
        }

        while (!stack.isEmpty()){
            int index = stack.pop();
            if (!stack.isEmpty()){
                ans = Math.max(ans, height[index] * (height.length - stack.peek() - 1));
            }
            else {
                ans = Math.max(ans, height[index] * height.length);
            }
        }
        return ans;
    }
}
