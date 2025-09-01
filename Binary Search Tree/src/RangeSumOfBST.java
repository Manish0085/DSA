import java.util.LinkedList;
import java.util.Queue;

public class RangeSumOfBST {

    int sum = 0;
    public int rangeSumOfBST1(Node root, int low, int high){
        if (root == null)
            return sum;

        if (root.data >= low && root.data <= high)
            sum += root.data;

        rangeSumOfBST1(root.left, low, high);
        rangeSumOfBST1(root.right, low, high);
        return sum;
    }


    public int rangeSumOfBST2(Node root, int low, int high){
        int ans = 0;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()){
            int size = que.size();
            for (int i = 0; i < size; i++) {
                Node temp = que.remove();
                if (temp.data >= low && temp.data <= high)
                    ans += temp.data;

                if (temp.left != null)
                    que.add(temp.left);

                if (temp.right != null)
                    que.add(temp.right);
            }
        }
        return ans;
    }
}
