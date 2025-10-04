import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBST {

    private int height = -1;

    public int heightRecursively(Node root){
        if (root == null)
            return height;
        int left = heightRecursively(root.left);
        int right = heightRecursively(root.right);

        return 1 + Math.max(left, right);
    }



    public int heightIteratively(Node root){
        int h = -1;
        if (root == null)
            return h;

        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()){
            int n = que.size();
            for (int i = 0; i < n; i++) {
                Node temp = que.poll();
                if (temp.left != null)
                    que.add(temp.left);
                if (temp.right != null)
                    que.add(temp.right);
            }
            h++;
        }
        return h;
    }

}
