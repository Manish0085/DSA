import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserialize {

    public String serialize(TreeNode root) {
        StringBuilder str = new StringBuilder();
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            TreeNode node = que.poll();
            if (node == null) {
                str.append("n ");
            } else {
                str.append(node.val + " ");
                que.offer(node.left);
                que.offer(node.right);
            }
        }
        return str.toString();
    }

    public TreeNode deserialize(String data) {
        
    }
}
