import java.util.ArrayList;
import java.util.List;

public class InorderTraversalUsingMorrisAlgo {

    public List<Integer> inorder(Node root){
        List<Integer> list = new ArrayList<>();
        while (root != null){
            if (root.left == null){
                list.add(root.data);
                root = root.right;
            } else {
                Node curr = root.left;
                while (curr.right != null && curr.right != root){
                    curr = curr.right;
                }

                if (curr.right == null){
                    curr.right = root;
                    root = root.left;
                } else {
                    curr.right = null;
                    list.add(root.data);
                    root = root.right;
                }
            }
        }
        return list;
    }
}
