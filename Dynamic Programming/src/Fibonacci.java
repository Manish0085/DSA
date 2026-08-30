public class Fibonacci {

    public int method1(int n) {
        if(n <= 1)
            return n;

        return method1(n-1) + method1(n-1);
    }

    // Memoization
    // TC:- O(n), SC:- O(n)
    public int method2(int n, int[] dp) {
        if(n <= 1)
            return n;

        if (dp[n] != -1)
            return dp[n];

        return dp[n] = method2(n-1, dp) + method2(n-2, dp);
    }



    // Tabulation
    // TC:- O(n), SC:- O(n)
    public int method3(int n, int[] dp) {
        int prev1 = 0;
        int prev2 = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public int method4(int n) {
        int prev1 = 0;
        int prev2 = 1;
        int curr = 0;
        for (int i = 2; i <= n ; i++) {
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 =  curr;
        }
        return curr;
    }
}
