import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BottomLeftTreeValue {



    // Brute Force Approach
    // In this approach, we will be using extra space to keep the track of all the left view elements
    public int leftMostBinaryTreeValue1(Node root){
        List<Integer> list = new ArrayList<>();
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()){
            int size = que.size();
            list.add(que.peek().data);
            for (int i = 0; i < size; i++) {
                Node temp = que.remove();
                if (temp.left != null)
                    que.add(temp.left);
                if (temp.right != null)
                    que.add(temp.right);
            }
        }
        return list.get(list.size()-1);
    }

    public int leftMostBinaryTreeValue2(Node root){
        int variable = 0;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()){
            int size = que.size();
            variable = que.peek().data;
            for (int i = 0; i < size; i++) {
                Node temp = que.remove();
                if (temp.left != null)
                    que.add(temp.left);
                if (temp.right != null)
                    que.add(temp.right);
            }
        }
        return variable;
    }


    // recursive method
    int ans = 0;
    int maxLevel = -1;

    public void leftMostBinaryTreeValue2(Node root, int level){
        if (root == null)
            return;

        if (level < maxLevel){
            maxLevel = level;
            ans = root.data;
        }

        leftMostBinaryTreeValue2(root.left, level+1);
        leftMostBinaryTreeValue2(root.right, level+1);
    }


}
