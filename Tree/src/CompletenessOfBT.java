import java.util.LinkedList;
import java.util.Queue;

public class CompletenessOfBT {

    public boolean isCompleteTree(TreeNode root) {
        if (root == null)
            return true;

        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        boolean flag = true;
        while (!que.isEmpty()) {
            int size = que.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = que.poll();
                if (node == null)
                    flag = false;
                else {
                    if (!flag)
                        return false;
                    que.offer(node.left);
                    que.offer(node.right);
                }
            }
        }
        return true;
    }
}
