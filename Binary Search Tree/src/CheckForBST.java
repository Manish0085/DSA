import java.util.ArrayList;
import java.util.List;

public class CheckForBST {


    int prev = Integer.MIN_VALUE;

    public boolean isBST2(Node root){
        if(root == null){
            return true;
        }
        boolean left = isBST2(root.left);
        if (left == false)
            return false;
        prev = root.data;
        if (root.data <= prev)
            return false;
        return isBST2(root.right);

    }


    // Brute force
    private void inorder(Node root, List<Integer> ans){
        if (root == null){
            return;
        }

        inorder(root.left, ans);
        ans.add(root.data);
        inorder(root.right, ans);

    }

    public boolean isBST1(Node root){
        List<Integer> list = new ArrayList<>();;
        inorder(root, list);
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i-1) > list.get(i))
                return false;
        }
        return true;
    }


}
