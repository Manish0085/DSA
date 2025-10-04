import java.util.LinkedList;
import java.util.Queue;

public class Size {

    private int size = 0;

    public int sizeRecusion(Node root){
        if(root == null)
            return this.size;

        this.size++;
        sizeRecusion(root.left);
        sizeRecusion(root.right);
        return this.size;
    }


    public int sizeIterative(Node root){
        int size = 0;
        if (root == null)
            return size;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()){
            size++;
            Node temp = que.remove();
            if (temp.left != null)
                que.add(temp.left);
            if (temp.right != null)
                que.add(temp.right);
        }
        return size;
    }


}
