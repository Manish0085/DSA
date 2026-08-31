public class FrogJump {

    public int method1(int[] nums, int idx) {
        if(idx == 0)
            return 0;

        int left = Math.abs(nums[idx] - nums[idx-1]) + method1(nums, idx-1);
        int right = Integer.MAX_VALUE;
        if (idx > 1)
            right = Math.abs(nums[idx-2] - nums[idx]) + method1(nums, idx-2);

        return Math.min(left, right);
    }

    public int method2(int[] nums, int idx, int[] dp) {
        if(idx == 0)
            return 0;

        if (dp[idx] != -1)
            return dp[idx];

        int left = Math.abs(nums[idx] - nums[idx-1]) + method2(nums, idx-1, dp);
        int right = Integer.MAX_VALUE;
        if(idx > 1)
            right = Math.abs(nums[idx] - nums[idx-2]) + method2(nums, idx-2, dp);

        return dp[idx] = Math.min(left, right);
    }

    public int method2(int[] nums) {
        int n = nums.length;
        if(n == 1)
            return nums[0];
        int[] dp = new int[n+1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int val1 = dp[i-1] + Math.abs(nums[i] - nums[i-1]);
            int val2 = Integer.MAX_VALUE;
            if (i > 1)
                val2 = dp[i-2] + Math.abs(nums[i] - nums[i-2]);
            dp[i] = Math.min(val1, val2);
        }
        return dp[n];
    }

    public int method4(int[] nums) {
        int n = nums.length;
        if(n == 1)
            return nums[0];
        int prev1 = 0;
        int prev2 = 0;
        int ans = -1;
        for (int i = 1; i <= n; i++) {
            int val1 = prev1 + Math.abs(nums[i] - nums[i-1]);
            int val2 = Integer.MAX_VALUE;
            if (i > 1)
                val2 = prev2 + Math.abs(nums[i-2] - nums[i]);

            ans = Math.min(val1, val2);
            prev2 = prev1;
            prev1 = ans;
        }
        return prev1;
    }
}
