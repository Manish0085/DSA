import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestValueInEachLevel {

    public List<Integer> find(Node root){
        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()){
            int max = 0;
            int n = que.size();
            for (int i = 0; i < n; i++) {
                Node temp = que.poll();
                max = Math.max(max, temp.data);
                if (temp.left != null)
                    que.add(temp.left);
                if (temp.right != null)
                    que.add(temp.right);
            }
            ans.add(max);
        }
        return ans;
    }

    public void dfs(Node root, int level, List<Integer> ans){
        if (root == null)
            return;

        if (ans.size() == level) {
            ans.add(root.data);
        }
        else {
            ans.set(level, Math.max(ans.get(level), root.data));
        }

        dfs(root.left, level+1, ans);
        dfs(root.right, level+1, ans);
    }
}
