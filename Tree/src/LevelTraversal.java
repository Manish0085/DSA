import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelTraversal {


    public ArrayList<ArrayList<Integer>> levelOrder(Node root){
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Node temp = null;
        while (!que.isEmpty()){
            int size = que.size();
            ArrayList<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                temp = que.remove();
                level.add(temp.data);
                if (temp.left != null){
                    que.add(temp.left);
                }
                if (temp.right != null){
                    que.add(temp.right);
                }

            }
            list.add(level);
        }
        return list;
    }
}
