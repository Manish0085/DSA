import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateSubTrees {

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String, Integer> map = new HashMap<>();
        List<TreeNode> ans = new ArrayList<>();
        dfs(root, map, ans);

        return ans;
    }

    public String dfs(TreeNode root, Map<String, Integer> map, List<TreeNode> ans) {
        if (root == null) {
            return "#";
        }

        String serial = root.val + ","
                + dfs(root.left, map, ans) + ","
                + dfs(root.right, map, ans);

        map.put(serial, map.getOrDefault(serial, 0) + 1);
        if (map.get(serial) == 2) {
            ans.add(root);
        }

        return serial;
    }

    public int dfs2(TreeNode root, Map<String, Integer> map, Map<Integer, Integer> count, List<TreeNode> ans, int[] arr) {
        if (root == null)
            return 0;

        int left = dfs2(root.left, map, count, ans, arr);
        int right = dfs2(root.right, map, count, ans, arr);
        String key = root.val + "," + left + "," + right;

        if (!map.containsKey(key)) {
            map.put(key, arr[0]++);
        }

        int subTreeId = map.get(key);
        count.put(subTreeId, count.getOrDefault(subTreeId, 0) + 1);
        if (count.get(subTreeId) == 2)
            ans.add(root);
        return subTreeId;
    }
}
