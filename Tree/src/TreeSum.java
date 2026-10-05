public class TreeSum
{

    public boolean isSumTree(TreeNode root) {
        // code here
        int ans = dfs(root);
        return ans != -1;

    }

    public int dfs(TreeNode root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return root.val;

        int left = dfs(root.left);
        int right = dfs(root.right);
        if(root.val != left + right || left == -1 || right == -1)
            return -1;
        return 2 * root.val;
    }
}
