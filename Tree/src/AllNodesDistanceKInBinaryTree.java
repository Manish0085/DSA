import java.util.*;

public class AllNodesDistanceKInBinaryTree {

    public void findParent(TreeNode root, TreeNode parent, Map<TreeNode, TreeNode> map) {
        if (root == null)
            return;

        if (parent != null)
            map.put(root, parent);

        findParent(root.left, root, map);
        findParent(root.right, root, map);
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Map<TreeNode, TreeNode> map = new HashMap<>();
        findParent(root, null, map);
        Set<TreeNode> set = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(target);
        int dis = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            if (dis == k) {
                while (!queue.isEmpty()) {
                    ans.add(queue.poll().val);
                }
                return ans;
            }
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null && set.add(node.left))
                    queue.offer(node.left);

                if (node.right != null && set.add(node.right))
                    queue.offer(node.right);

                TreeNode parent = map.get(node);
                if (parent != null && set.add(node))
                    queue.offer(parent);
            }
            dis++;
        }
        return ans;
    }

}
