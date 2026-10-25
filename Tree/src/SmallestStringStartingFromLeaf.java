import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;

public class SmallestStringStartingFromLeaf {

    public String smallestFromLeaf(TreeNode root) {
//        List<String> list = new ArrayList<>();
//        dfs(root, list, new StringBuilder());
//        list.sort((a, b) -> a.compareTo(b));
//        return list.get(0);

        String[] ans = {null};
        dfs(root, ans, new StringBuilder());
        return ans[0];
    }

    public void dfs(TreeNode root, String[] ans, StringBuilder sb) {
        if (root == null)
            return;

        char ch = (char) ('a' + root.val);
        sb.append(ch);
        if (root.left == null && root.right == null) {
            String str = sb.reverse().toString();
            sb.reverse();

            if (ans[0] == null) {
                ans[0] = str;
            } else {
                ans[0] = str.compareTo(ans[0]) < 1? str: ans[0];
            }
        }

        dfs(root.left, ans, sb);
        dfs(root.right, ans, sb);
        sb.deleteCharAt(sb.length()-1);
    }

    public void dfs(TreeNode root, List<String> list, StringBuilder sb) {
        if (root == null)
            return;

        char ch = (char)('a' + root.val);
        sb.append(ch);
        if (root.left == null && root.right == null) {
            String str = sb.reverse().toString();
            sb.reverse();
            list.add(str);
        }

        dfs(root.left, list, sb);
        dfs(root.right, list, sb);
        sb.deleteCharAt(sb.length()-1);
    }
}
