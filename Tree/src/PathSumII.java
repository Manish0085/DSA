import java.io.IOError;
import java.util.ArrayList;
import java.util.List;

public class PathSumII {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(root, targetSum, ans, list);
        return ans;
    }

    public void dfs(TreeNode root, int target, List<List<Integer>> ans, List<Integer> list) {
        if (root == null)
            return;

        list.add(root.val);

        if (root.left == null && root.right == null)
            ans.add(new ArrayList<>(list));

        dfs(root.left, target-root.val, ans, list);
        dfs(root.right, target - root.val, ans, list);
        list.remove(list.size()-1);
    }
}
