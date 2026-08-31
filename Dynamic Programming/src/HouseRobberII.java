public class HouseRobberII {


    public int method1(int[] nums, int idx, int end) {
        if (idx >= end)
            return 0;

        int rob = nums[idx] + method1(nums, idx+2, end);
        int skip = method1(nums, idx+1, end);

        return Math.max(rob, skip);
    }

    public int method2(int[] nums, int idx, int end, int[] dp) {
        if (idx == end)
            return 0;

        if(dp[idx] != -1)
            return dp[idx];
        int rob = nums[idx] + method2(nums, idx+2, end, dp);
        int skip = method2(nums, idx+1, end, dp);

        return dp[idx] = Math.max(rob, skip);
    }


    public int method3(int[] nums, int start, int end) {

        int[] dp = new int[end+1];
        dp[start] = nums[start];
        if(start+1 < end)
            dp[start+1] = Math.max(nums[start], nums[start+1]);

        for (int i =2; i <= end; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }


        return dp[end];
    }

    public int method4(int[] nums, int start, int end) {
        int prev1 = nums[start];
        if(start+1 >= end)
            return prev1;

        int prev2 = Math.max(nums[start], nums[start+1]);
        int ans = -1;
        for (int i = start+2; i < end; i++) {
            ans = Math.max(prev2, prev1+nums[i]);
            prev1 = prev2;
            prev2 = ans;
        }

        return ans;
    }

}
