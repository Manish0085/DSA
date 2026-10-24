public class IsSymmetric
{
    public boolean isSymmetric(TreeNode root) {
        return dfs(root.left, root.right);

    }

    public boolean dfs(TreeNode left, TreeNode right) {
        if(left == null || right == null)
            return left == right;

        if(left.val != right.val)
            return false;

        return dfs(left.left, right.right) &&
                dfs(left.right, right.left);
    }
}
