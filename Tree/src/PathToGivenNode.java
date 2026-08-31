import java.util.List;

public class PathToGivenNode
{

    public boolean path(TreeNode root, int node, List<Integer> list) {
        if (root == null)
            return false;
        list.add(root.val);
        if(root.val == node)
            return true;

        if (path(root.left, node, list) || path(root.right, node, list))
            return true;

        list.remove(list.size()-1);
        return false;
    }
}
