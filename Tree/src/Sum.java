import java.util.LinkedList;
import java.util.Queue;

public class Sum {

    private int sum = 0;
    public int sumOfBST(Node root){
        if (root == null)
            return this.sum;

        this.sum += root.data;
        sumOfBST(root.left);
        sumOfBST(root.right);
        return this.sum;
    }


    public int sumOfBSTIterative(Node root){
        int sum = 0;
        if (root == null)
            return sum;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()){
            Node temp = que.poll();
            sum += temp.data;
            if (temp.left != null)
                que.add(temp.left);
            if (temp.right != null)
                que.add(temp.right);
        }
        return sum;
    }
}
