public class InvertBinaryTree {

    public void dfs(TreeNode root) {
        if (root == null)
            return;

        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;

        dfs(root.left);
        dfs(root.right);
    }
}
