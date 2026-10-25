import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class Node2 {
    public int val;
    public List<Node2> children;

    public Node2() {}

    public Node2(int _val) {
        val = _val;
    }

    public Node2(int _val, List<Node2> _children) {
        val = _val;
        children = _children;
    }

}
public class NArrayLevelOrderTraversal {

    public List<List<Integer>> levelOrder(Node2 root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<Node2> que = new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            int size = que.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node2 node = que.poll();
                list.add(node.val);
                for (Node2 child: node.children) {
                    que.offer(child);
                }
            }
            ans.add(new ArrayList<>(list));
        }
        return ans;
    }
}

