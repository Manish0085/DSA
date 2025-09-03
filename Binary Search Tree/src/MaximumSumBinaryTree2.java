import java.nio.file.FileAlreadyExistsException;

public class MaximumSumBinaryTree2 {

    static class SubTree{
        boolean BST;
        int sum;
        int max;
        int min;



        public SubTree(){
            this.BST = false;
            int sum = 0;
            this.max = Integer.MIN_VALUE;
            this.min = Integer.MAX_VALUE;
        }
    }
    int totalSum;

    public int maxSumBST(Node root){
        this.totalSum = 0;
        find(root);
        return totalSum;
    }

    public SubTree find(Node root){
        if (root == null)
            return new SubTree();

        SubTree leftHead = find(root.left);
        SubTree rightHead = find(root.right);
        if(leftHead.BST && rightHead.BST && leftHead.max < root.data && rightHead.min > root.data){
            SubTree head = new SubTree();
            head.sum = root.data + leftHead.sum + rightHead.sum;
            head.min = Math.min(root.data, leftHead.min);
            head.max = Math.min(root.data, rightHead.max);
            totalSum = Math.max(totalSum, head.sum);
            return head;
        }
        else {
            leftHead.BST = false;
            return leftHead;
        }
    }
}
