import java.util.ArrayList;
import java.util.List;

public class KthSmallest {

    // Brute force
    public int kthSmallest(Node root, int k){
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list.get(k-1);
    }

    private void inorder(Node root, List<Integer> list){
        if (root == null)
            return;

        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
}
