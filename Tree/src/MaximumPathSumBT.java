public class MaximumPathSumBT {
    public int maxPathSum(TreeNode root) {
        int[] ans = {Integer.MIN_VALUE};
        dfs(root, ans);
        return ans[0];
    }

    public int dfs(TreeNode root, int [] ans) {
        if (root == null)
            return 0;

        int left = Math.max(dfs(root.left, ans), 0);
        int right = Math.max(dfs(root.right, ans), 0);
        ans[0] = Math.max(ans[0], left+right+root.val);

        return Math.max(left, right) + root.val;
    }
}
