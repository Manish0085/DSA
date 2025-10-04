import java.util.LinkedList;
import java.util.Queue;

public class CountNonLeave {


    private int count = 0;

    public int countRecursively(Node root){
        if (root == null){
            return this.count;
        }

        if (root.left != null || root.right != null)
            this.count++;

        countRecursively(root.left);
        countRecursively(root.right);
        return this.count;
    }

    public int countIteratively(Node root){
        int countLeave = 0;
        if (root == null)
            return countLeave;

        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()){
            Node temp = que.poll();
            if (temp.left != null || temp.right != null)
                countLeave++;

            if (temp.left != null)
                que.add(temp.left);

            if (temp.right != null)
                que.add(temp.right);
        }
        return countLeave;
    }
}
