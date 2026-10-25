import java.util.LinkedList;
import java.util.Queue;

class Pair1 {
    int idx;
    TreeNode node;

    public Pair1(int idx, TreeNode node) {
        this.idx = idx;
        this.node = node;
    }
}
public class MaximumWidthOfBinaryTree {

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        Queue<Pair1> que = new LinkedList<>();
        que.offer(new Pair1(0, root));
        int max = 0;

        while (!que.isEmpty()) {
            int size = que.size();
            int level = que.peek().idx;
            for (int i = 0; i < size; i++) {
                int idx = que.peek().idx;
                TreeNode node = que.peek().node;
                que.poll();
                if (i == size-1) {
                    max = Math.max(max, idx - level + 1);
                }
                if (node.left != null)
                    que.offer(new Pair1(2*idx + 1, node.left));
                if (node.right != null)
                    que.offer(new Pair1(2*idx + 2, node.right));

            }
        }
        return max;
    }
}
