public class CountGoodNodes {

    public int goodNodes(TreeNode root) {
        if (root == null)
            return 0;
        int[] ans = {1};
        dfs(root, ans, Integer.MIN_VALUE);
        return ans[0];
    }

    public void dfs(TreeNode root, int[] ans, int min) {
        if (root == null)
            return;

        if (root.val >= min) {
            min = root.val;
            ans[0]++;
        }

        dfs(root.left, ans, min);
        dfs(root.right, ans, min);
    }
}
