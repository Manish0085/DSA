public class CompleteTreeNode {

    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;

        int leftH = 0;
        int rightH = 0;

        TreeNode left = root;
        TreeNode right = root;

        while (left != null) {
            leftH++;
            left = left.left;
        }
        while (right != null) {
            rightH++;
            right = right.right;
        }

        if (leftH == rightH)
            return (int) Math.pow(2, leftH) - 1;

        return 1 + countNodes(root.left) + countNodes(root.right);

    }
}
