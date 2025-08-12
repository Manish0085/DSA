import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeftViewOfBinaryTree {

    public List<Integer> leftView(Node root){
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()){
            int size = que.size();
            list.add(que.peek().data);
            while (size-- > 0){
                Node temp = que.remove();
                if (temp.left != null)
                    que.add(temp.left);
                if (temp.right != null)
                    que.add(temp.right);
            }
        }
        return list;
    }

    public List<Integer> leftViewUsingRecursion(Node root, int level, List<Integer> ans){
        if (root == null){
            return ans;
        }
        if (level == ans.size())
            ans.add(root.data);

        leftViewUsingRecursion(root.left, level+1, ans);
        leftViewUsingRecursion(root.right, level+1, ans);
        return ans;
    }
}
