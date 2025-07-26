package Questions;

import javax.naming.spi.StateFactory;
import java.util.Stack;

public class HighestRectangleInHistogramUsingStack
{

    // T.C:- O(n)
    // S.C:- O(n)

    public static int largestRectangleArea(int[] heights){

        int[] NSR = nextSmallestOnRight(heights);
        int[] NSL = nextSmallestOnLeft(heights);

        for (int num: NSR){
            System.out.print(num+" ");
        }
        System.out.println();
        for (int num: NSL){
            System.out.print(num+" ");
        }

        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            ans = Math.max(ans, heights[i] * (NSR[i] - NSL[i] -1));
        }
        System.out.println(ans);
        return ans;
    }

    public static int[] nextSmallestOnRight(int[] heights){
        int[] NSR = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            NSR[i] = heights.length;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]){
                NSR[stack.pop()] = i;
            }
            stack.push(i);
        }
        return NSR;
    }


    public static int[] nextSmallestOnLeft(int[] heights){

        int[] NSL = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            NSL[i] = -1;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = heights.length-1; i >=0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]){
                NSL[stack.pop()] = i;
            }
            stack.push(i);
        }

        return NSL;
    }

    public static void main(String[] args) {
        largestRectangleArea(new int[]{2,1,5,6,2,3});
    }
}
