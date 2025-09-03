public class LargestBST2 {


    static class SubTree{
        boolean BST;
        int size;
        int max;
        int min;


        public SubTree(){
            this.BST = true;
            this.size = 0;
            this.max = Integer.MIN_VALUE;
            this.min = Integer.MAX_VALUE;
        }

    }

    int totalSize;


    public int LargestBST(Node root){
        this.totalSize = 0;
        find(root);
        return totalSize;

    }


    public SubTree find(Node root){
        // root doesn't exist
        if (root == null)
            return new SubTree();
        // root exists
        SubTree leftHead = find(root.left);
        SubTree rightHead = find(root.left);

        if (leftHead.BST && rightHead.BST && leftHead.max < root.data && rightHead.min > root.data){
            SubTree head = new SubTree();
            head.size = 1 + (leftHead.size + rightHead.size);
            head.min = Math.min(root.data, leftHead.min);
            head.max = Math.max(root.data, rightHead.max);
            return head;
        } else {
            leftHead.BST = false;
            return leftHead;
        }

    }
}
