import com.sun.source.tree.Tree;

import java.util.*;

public class MaxTimeToBurnCompleteTree {

    public void findParent(TreeNode root, Map<TreeNode, TreeNode> map, TreeNode parent) {
        if (root == null)
            return;

        if (parent != null) {
            map.put(root, parent);
        }
        findParent(root.left, map, root);
        findParent(root.right, map, root);
    }

    public TreeNode findNode(TreeNode root, int start) {
        if (root == null)
            return null;

        if (root.val == start)
            return root;

        TreeNode left = findNode(root.left, start);
        if (left != null)
            return left;
        return findNode(root.right, start);
    }
    public int amountOfTime(TreeNode root, int start) {
        if (root == null)
            return 0;

        Map<TreeNode, TreeNode> map = new HashMap<>();
        Set<TreeNode> set = new HashSet<>();
        findParent(root, map, null);
        TreeNode target = findNode(root, start);
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(target);
        set.add(target);
        int ans = -1;
        while (!que.isEmpty()) {
            int size = que.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = que.poll();
                if (node.left != null && set.add(node.left))
                    que.offer(node.left);
                if (node.right != null && set.add(node.right))
                    que.offer(node.right);


                TreeNode parent = map.get(node);
                if (parent != null && set.add(parent))
                    que.offer(parent);
            }
            ans++;
        }
        return ans;
    }
}
