public class PathSumI {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum);
    }

    public boolean dfs(TreeNode root, int target) {
        if(root == null)
            return false;

        if (root.val == target && root.left == null && root.right == null)
            return true;

        return dfs(root.left, target-root.val) ||
                dfs(root.right, target - root.val);
    }
}
