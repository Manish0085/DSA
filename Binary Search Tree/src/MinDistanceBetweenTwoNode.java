import java.util.ArrayList;
import java.util.List;

public class MinDistanceBetweenTwoNode {

    int prev = Integer.MIN_VALUE;
    int ans = Integer.MAX_VALUE;

    public int minDist2(Node root){
        if (root == null)
            return ans;


        minDist2(root.left);
        if (prev != Integer.MIN_VALUE)
            ans = Math.min(ans, root.data-prev);
        prev = root.data;
        minDist2(root.right);
        return ans;
    }


    // Brute Force
    public int minDist1(Node root){
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            ans = Math.max(ans, Math.abs(list.get(i) - list.get(i-1)));
        }
        return ans;
    }


    private void inorder(Node root, List<Integer> list){
        if (root == null)
            return;

        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
}
