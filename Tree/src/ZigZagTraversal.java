import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {

    public List<List<Integer>> zigZag(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        int level = 0;
        while (!que.isEmpty()) {
            int size = que.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = que.poll();
                if (level %2 == 0) {
                    list.add(node.val);
                } else {
                    list.add(0, node.val);
                }

                if (node.left != null) {
                    que.offer(node.left);
                } if(node.right != null) {
                    que.offer(node.right);
                }
            }
            ans.add(new ArrayList<>(list));
            level++;
        }
        return ans;
    }
}
