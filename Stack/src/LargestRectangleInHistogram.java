//import java.util.Map;
//import java.util.Stack;
//
//public class LargestRectangleInHistogram {
//
//    public int largestRectangleArea(int[] heights) {
//        int maxArea = -1;
//        Stack<Integer> stack = new Stack<>();
//        for (int i = 0; i < heights.length; i++) {
//            while (!stack.isEmpty() && stack.peek() )
//        }
//    }
//
//
////    public int largestRectangleArea(int[] heights) {
////        int maxArea = -1;
////        for (int i = 0; i < heights.length; i++) {
////            int minHeight = Integer.MAX_VALUE;
////            for (int j = i; j < heights.length; j++) {
////                minHeight = Math.min(minHeight, heights[j]);
////
////                int width = j - 1 + 1;
////                int area = width * minHeight;
////
////                maxArea = Math.max(maxArea, area);
////            }
////        }
////        return maxArea;
////    }
//
//}
