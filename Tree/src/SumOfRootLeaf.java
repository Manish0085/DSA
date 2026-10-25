public class SumOfRootLeaf {
    public int sumNumbers(TreeNode root) {
        int[] ans = {0};
        dfs(root, ans, 0);
        return ans[0];
    }

    public void dfs(TreeNode root, int[] ans, int sum) {
        if (root == null)
            return;

        if (root.left == null && root.right == null)
            ans[0] += (sum*10 + root.val);

        dfs(root.left, ans, sum * 10 + root.val);
        dfs(root.right, ans, sum * 10 + root.val);
    }
}
