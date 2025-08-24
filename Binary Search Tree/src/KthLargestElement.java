import java.util.ArrayList;
import java.util.List;

public class KthLargestElement {


    int k = 0;
    int ans = 0;

    public int kthlargest2(Node root, int k){
        this.k = k;
        findKthLargest(root);
        return ans;
    }

    private void findKthLargest(Node root){
        if (root == null)
            return;

        findKthLargest(root.left);
        this.k--;
        if (this.k >= 0)
            ans = root.data;
        if (this.k < 0)
            return;

        findKthLargest(root.left);
    }

    // Brute force
    public int kthlargest1(Node root, int k){
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list.get(k-1);
    }

    private void inorder(Node root, List<Integer> list){
        if (root == null)
            return;

        inorder(root.right, list);
        list.add(root.data);
        inorder(root.left, list);
    }
}
