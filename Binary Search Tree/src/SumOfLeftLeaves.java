public class SumOfLeftLeaves {


    int sum = 0;

    public int sumOfLeftLeaves(Node root){
        sum(root);
        return sum;
    }

    public void sum(Node root){
        if (root == null)
            return;

        if ((root.left != null) && (root.left.left != null && root.left.right != null)){
            this.sum += root.left.data;
        }

        sum(root.left);
        sum(root.right);
    }
}
