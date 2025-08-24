import java.util.ArrayList;
import java.util.List;

public class CheckForBST {

    private void inorder(Node root, List<Integer> ans){
        if (root == null){
            return;
        }

        inorder(root.left, ans);
        ans.add(root.data);
        inorder(root.right, ans);

    }

    public boolean isBST(Node root){
        List<Integer> list = new ArrayList<>();;
        inorder(root, list);
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i-1) > list.get(i))
                return false;
        }
        return true;
    }
}
