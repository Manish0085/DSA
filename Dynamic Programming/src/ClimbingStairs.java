public class ClimbingStairs {

    public static int method1(int stairs){
        if (stairs <= 2){
            return stairs;
        }

        return method1(stairs-1) + method1(stairs-2);
     }


     public static int method2(int n, int[] dp) {
        if(n <= 2)
            return n;

        if(dp[n] != -1)
            return dp[n];

        return dp[n] = method2(n-1, dp) + method2(n-2, dp);
     }

     public static int method3(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
     }

    public static int method4(int n) {

        int prev1 = 1;
        int prev2 = 2;
        int ans = 0;
        for (int i = 3; i <= n; i++) {
            ans = prev1 + prev2;
            prev1 = prev2;
            prev2 = ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(method1(4));
    }
}
