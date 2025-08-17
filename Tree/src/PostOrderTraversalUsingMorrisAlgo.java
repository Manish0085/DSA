import javax.naming.NoPermissionException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PostOrderTraversalUsingMorrisAlgo {

    public List<Integer> postOrder(Node root){
        List<Integer> list = new ArrayList<>();
        while (root != null){
            if (root.right == null){
                list.add(root.data);
                root = root.left;
            }
            else {
                Node curr = root.right;
                while (curr.left != null && curr.left != root){
                    curr = curr.left;
                }
                if (curr.left == null){
                    curr.left = root;
                    root = root.right;
                } else {
                    curr.left = null;
                    root = root.left;
                }
            }
        }
        return list;
    }
}
