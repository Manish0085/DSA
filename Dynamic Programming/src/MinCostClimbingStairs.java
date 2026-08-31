public class MinCostClimbingStairs {

    public int method1(int[] cost, int idx) {
        if(idx >= cost.length)
            return 0;

        int left = cost[idx] + method1(cost, idx+1);
        int right = Integer.MAX_VALUE;
        if (idx < cost.length-1)
            right = cost[idx] + method1(cost, idx+2);
        return Math.min(left, right);
    }

    public int method1(int[] cost, int idx, int[] dp)  {
        if(idx >= cost.length)
            return 0;

        if(dp[idx] != -1) return dp[idx];

        int left = cost[idx] + method1(cost, idx+1, dp);
        int right = Integer.MAX_VALUE;
        if (idx < cost.length-1)
            right = cost[idx] + method1(cost, idx+2, dp);
        return dp[idx] = Math.min(left, right);
    }


    public int method2(int[] cost) {
        int n = cost.length;
        if(n == 1)
            return cost[0];
        int[] dp = new int[n];

        dp[1] = cost[0];
        dp[2] = cost[1];
        for (int i = 2; i<cost.length; i++) {
            dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }
        return Math.min(dp[n-1], dp[n-2]);
    }

    public int method3 (int[] cost) {
        int n = cost.length;
        if(n == 1)
            return cost[0];

        int prev1 = cost[0];
        int prev2 = cost[1];
        int ans = Integer.MAX_VALUE;
        for (int i=2; i<n; i++) {
            ans = cost[i] + Math.min(prev1, prev2);
            prev1 = prev2;
            prev2 = ans;
        }
        return Math.min(prev1, prev2);
    }



}
