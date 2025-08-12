import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightViewOfBinaryTee {

    public List<Integer> rightView(Node root){
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()){
            int size = que.size();
            while (size-- > 0){
                Node temp = que.remove();
                if(size == 0){
                   list.add(temp.data);
                }
                if (temp.left != null){
                    que.add(temp.left);
                }
                if (temp.right != null){
                    que.add(temp.right);
                }
            }
        }
        return list;
    }
}
