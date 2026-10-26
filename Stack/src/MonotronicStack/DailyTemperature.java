package MonotronicStack;

import java.util.Stack;

public class DailyTemperature {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        for (int i = temperatures.length-1; i >= 0; i--) {
            int temp = temperatures[i];
            while (!stack.isEmpty() && stack.peek()[0] <= temp) {
                stack.pop();
            }
            ans[i] = stack.isEmpty()? 0: stack.peek()[1] - i;
            stack.push(new int[]{temp, i});

        }
        return ans;
    }

    public int[] dailyTemperatures1(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];
            for (int j = i+1; j < temperatures.length; j++) {
                if (temperatures[j] > temp) {
                    ans[i] = j-i;
                    break;
                }
            }
        }
        return ans;
    }
}
