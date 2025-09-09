import java.util.ArrayList;
import java.util.List;

public class BSTToMaxHeap {

    int index;

    void convertToMaxHeapUtil(Node root){

        // Inorder Traversal
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);

        // Postorder Traversal
        this.index = 0;
        postorder(root, ans, index);
    }

    public void inorder(Node root, List<Integer> list){
        if (root == null)
            return;

        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    public void postorder(Node root, List<Integer> list, int index){
        if (root == null)
            return;

        postorder(root.left, list, index);
        postorder(root.right, list, index);
        root.data = list.get(index);
        this.index++;
    }
}
