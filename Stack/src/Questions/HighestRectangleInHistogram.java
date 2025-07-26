package Questions;

public class HighestRectangleInHistogram {



    // T.C:- O(n*n)
    // S.C:- O(n*n)

    public static int largestRectangleArea(int[] heights){

        int[] NSR = nextSmallestOnRight(heights);
        int[] NSL = nextSmallestOnLeft(heights);

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
        for (int i = 0; i < heights.length; i++) {
            for (int j = i+1; j < heights.length; j++) {
                if (heights[i] > heights[j]){
                    NSR[i] = j;
                    break;
                }
            }
        }
        return NSR;
    }


    public static int[] nextSmallestOnLeft(int[] heights){

        int[] NSL = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            NSL[i] = -1;
        }
        for (int i = heights.length-1; i >=0; i--) {
            for (int j = i-1; j >=0 ; j--) {
                if(heights[i] > heights[j]){
                    NSL[i] = j;
                    break;
                }
            }
        }
        return NSL;
    }

    public static void main(String[] args) {
        largestRectangleArea(new int[]{2, 3, 4, 2, 6, 5, 4, 5, 3});
    }
}
