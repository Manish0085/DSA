import java.util.*;

class Double {
    TreeNode node;
    int col;

    public Double(TreeNode node, int col) {
        this.node = node;
        this.col = col;
    }
}
public class BottomView {

    public List<Integer> bottomView(TreeNode root) {
        if(root == null)
            return new ArrayList<>();

        List<Integer> ans = new ArrayList<>();
        Queue<Double> que = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        que.offer(new Double(root, 0));

        while (!que.isEmpty()) {
            Double pair = que.poll();
            int col = pair.col;
            TreeNode node = pair.node;

            map.put(col, node.val);
            if (node.left != null)  {
                que.offer(new Double(node.left, col-1));
            }
            if (node.right != null)  {
                que.offer(new Double(node.right, col+1));
            }
        }

        for (int i: map.values()) {
            ans.add(i);
        }
        return ans;
    }
}
