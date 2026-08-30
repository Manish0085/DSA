public class HouseRobber {

    public int method1(int[] nums, int idx) {
        if(idx >= nums.length)
            return 0;

        int rob = nums[idx] + method1(nums, idx+2);
        int skip = method1(nums, idx+1);

        return Math.max(rob, skip);
    }

    public int method1(int[] nums, int idx, int[] dp) {
        if(idx >= nums.length)
            return 0;

        if (dp[idx] != -1)
            return dp[idx];

        int rob = nums[idx] + method1(nums, idx+2);
        int skip = method1(nums, idx+1);

        return dp[idx] = Math.max(rob, skip);
    }

    public int method3(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i-2], nums[i-1]);
        }
        return dp[nums.length-1];
    }

    public int method4(int[] nums) {
        if(nums.length == 1)
            return nums[0];

        int prev1 = nums[0];
        int prev2 = Math.max(nums[0], nums[1]);
        int result = 0;
        for (int i=2; i< nums.length; i++) {
            result = Math.max(nums[i] + prev1, prev2);
            prev1 = prev2;
            prev2 = result;
        }
        return result;
    }
}
