public class MaximumSumBinaryTree {



    static class SubTree{
        boolean BST;
        int sum;
        int max;
        int min;

        public SubTree(int data){
            this.BST = true;
            this.sum = data;
            this.max = data;
            this.min = data;
        }


    }

    int totalSum;

    public int maxSumSubTree(Node root){
        this.totalSum = 0;
        find(root);
        return totalSum;
    }

    public SubTree find(Node root){
        if (root.left == null && root.right == null) {
            totalSum = Math.max(totalSum, root.data);
            return new SubTree(root.data);
        }

        else if (root.left == null && root.right != null){
            SubTree head = find(root.right);
            if (head.BST && head.min > root.data){
                head.sum += root.data;
                head.min = root.data;
                totalSum = Math.max(totalSum, head.sum);
                return head;
            }
            else {
                head.BST = false;
                return head;
            }
        }
        else if (root.left != null && root.right == null){
            SubTree head = find(root.left);
            if (head.BST && head.max < root.data){
                head.sum += root.data;
                head.max = root.data;
                totalSum = Math.max(totalSum, head.sum);
                return head;
            } else {
                head.BST = false;
                return head;
            }
        }
        else {
            SubTree leftHead = find(root.left);
            SubTree rightHead = find(root.right);
            if (leftHead.BST && rightHead.BST && leftHead.max < root.data && rightHead.min > root.data){
                SubTree head = new SubTree(root.data);
                head.sum = root.data + leftHead.sum + rightHead.sum;
                head.min = leftHead.min;
                head.max = rightHead.max;
                totalSum = Math.max(totalSum, head.sum);
                return head;
            } else {
                leftHead.BST = false;
                return leftHead;
            }
        }
    }

}
