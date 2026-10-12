import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversal {

    public List<Integer> boundaryTraversal(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        List<Integer> ans = new ArrayList<>();
        ans.add(root.val);
        leftBoundary(root.left, ans);
        bottomBoundary(root.left, ans);
        bottomBoundary(root.right, ans);
        rightBoundary(root.right, ans);
        return ans;
    }

    private void rightBoundary(TreeNode root, List<Integer> ans) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }

        if (root.right != null) {
            rightBoundary(root.right, ans);
        } else {
            rightBoundary(root.left, ans);
        }
        ans.add(root.val);
    }

    private void bottomBoundary(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            ans.add(root.val);
        }
        bottomBoundary(root.left, ans);
        bottomBoundary(root.right, ans);
    }

    private void leftBoundary(TreeNode root, List<Integer> ans) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }
        ans.add(root.val);
        if (root.left != null) {
            leftBoundary(root.left, ans);
        } else {
            leftBoundary(root.right, ans);
        }
    }
}
