import java.util.ArrayList;
import java.util.List;

public class LCA {

    public int lca(TreeNode root, int A, int B) {
        List<TreeNode> list1 = new ArrayList<>();
        dfs(root, A, list1);
        List<TreeNode> list2 = new ArrayList<>();
        dfs(root, B, list2);
        int ans = -1;
        for(int i=0; i<Math.min(list1.size(), list2.size()); i++) {
            if(list1.get(i) == list2.get(i)) {
                ans = list1.get(i).val;
            }
        }
        return ans;
    }

    public boolean dfs(TreeNode root, int node, List<TreeNode> list) {
        if(root == null)
            return false;

        list.add(root);

        if(root.val == node)
            return true;

        if(dfs(root.left, node, list) || dfs(root.right, node, list)) {
            return true;
        }

        return false;

    }


    // Method 2
    public boolean find(TreeNode root, int val) {
        if(root == null)
            return false;

        if(root.val == val)
            return true;

        return find(root.left, val) || find(root.right, val);
    }

    public TreeNode dfs(TreeNode root, int val1, int val2) {
        if(root == null)
            return null;

        if(root.val == val1 || root.val == val2)
            return root;
        TreeNode left = dfs(root.left, val1, val2);
        TreeNode right = dfs(root.right, val1, val2);

        if(left == null)
            return right;
        else if (right == null)
            return left;
        return root;
    }

    public int lca2(TreeNode root, int val1, int val2) {
        if(!find(root, val1) || !find(root, val2))
            return -1;

        TreeNode node = dfs(root, val1, val2);
        return node.val;
    }
}
