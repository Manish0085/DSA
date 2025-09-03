import java.util.Map;

public class LargestBST {


    static class SubTree {
        boolean BST;
        int size;
        int max, min;


        SubTree(int data) {
            this.BST = true;
            this.size = 1;
            this.max = data;
            this.min = data;
        }

    }

    int totalSize;

    public int largetBst(Node root){
        this.totalSize = 0;
        find(root);
        return totalSize;
    }

    public SubTree find(Node root){
        // Leaf Node
        if (root.left == null && root.right == null){
            totalSize = Math.max(totalSize, 1);
            return new SubTree(root.data);
        }
        // Left Side doesn't exist
        else if (root.left == null && root.right != null){
            SubTree head = find(root.right);
            if (head.BST && head.min > root.data){
                head.size++;
                head.min = root.data;
                totalSize = Math.max(totalSize, head.size);
                return head;
            }
            else {
                head.BST = false;
                return head;
            }
        }

        // Right side doesn't exist
        else if (root.left != null && root.right == null){
            SubTree head = find(root.left);
            if (head.BST && head.max < root.data){
                head.size++;
                head.max = root.data;
                totalSize = Math.max(totalSize, head.size);
                return head;
            }
            else {
                head.BST = false;
                return head;
            }
        }

        // Both side exists
        else {
            SubTree leftHead = find(root.left);
            SubTree rightHead = find(root.right);
            if (leftHead.BST && rightHead.BST && leftHead.max < root.data && rightHead.min > root.data){
                SubTree head = new SubTree(root.data);
                head.size += (leftHead.size + rightHead.size);
                head.min  = leftHead.min;
                head.max = rightHead.max;
                totalSize = Math.max(totalSize, head.size);
                return head;
            }
            else {
                leftHead.BST = false;
                return leftHead;
            }
        }
    }

}
