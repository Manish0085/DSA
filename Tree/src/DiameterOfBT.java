public class DiameterOfBT {


    public int diameterOfBinaryTree(TreeNode root) {
        int[] ans = {0};
        dfs(root, ans);
        return ans[0];
    }

    public int dfs(TreeNode root, int[] ans) {
        if (root == null)
            return 0;

        int left = height(root.left);
        int right = height(root.right);
        ans[0] = Math.max(ans[0], left+right);

        return Math.max(dfs(root.left, ans),
            dfs(root.right, ans));
    }

    private int height(TreeNode root) {
        if (root == null)
            return 0;

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public int dfs2(TreeNode root, int[] ans) {
        if (root == null)
            return 0;

        int left = dfs2(root.left, ans);
        int right = dfs2(root.right, ans);
        ans[0] = Math.max(ans[0], left + right);

        return Math.max(left, right)  +1;
    }
}
