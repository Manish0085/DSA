import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversalUsingMorrisAlgo {


    public List<Integer> preorder(Node root){
        List<Integer> list = new ArrayList<>();
        while (root != null){
            if (root.left == null){
                list.add(root.data);
                root = root.right;
            }
            else {
                Node curr = root.left;
                while (curr.right != null && curr.right != root){
                    curr = curr.right;
                }

                if (curr.right == null){
                    list.add(root.data);
                    curr.right = root;
                    root = root.left;

                }
                else {
                    curr.right = null;
                    root = root.right;
                }
            }
        }
        return list;
    }
}
