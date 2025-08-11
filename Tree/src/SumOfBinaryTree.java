public class SumOfBinaryTree {

    public int sum1(Node root){
        if (root == null)
            return 0;

        return root.data + sum1(root.left) + sum1(root.right);
    }

    public int sum2(Node root, int sum){
        if (root == null)
            return sum;

        sum += root.data;
        sum = sum2(root.left, sum);
        sum = sum2(root.right, sum);

        return sum;
    }
}
