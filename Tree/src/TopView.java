import java.util.*;

public class TopView {

    public List<Integer> topView(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<TreeNode> que = new LinkedList<>();
        Queue<Integer> columns = new LinkedList<>();
        que.offer(root);
        columns.offer(0);
        while (!que.isEmpty()) {
            TreeNode node = que.poll();
            int col = columns.poll();

            if (!map.containsKey(col)) {
                map.put(col, node.val);
            }

            if (node.left != null) {
                que.offer(node.left);
                columns.offer(col-1);
            }

            if (node.right != null) {
                que.offer(node.right);
                columns.offer(col+1);
            }
        }

        for(int i: map.values()) {
            ans.add(i);
        }

        return ans;
    }
}
