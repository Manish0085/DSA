public class BalancedTree {


    public boolean check(Node root){
        if (root == null)
            return true;

        int left = height(root.left);
        int right = height(root.right);

        if (Math.abs(left - right) > 1)
            return false;

        return check(root.left) &&
                check(root.right);
    }

    private int height(Node root){
        if (root == null)
            return 0;

        return 1+ Math.max(height(root.left), height(root.right));
    }
}
