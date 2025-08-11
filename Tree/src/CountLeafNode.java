public class CountLeafNode {

    public int countLeaf1(Node root, int count){
        if (root == null){
            return count;
        }
        if (root.left == null && root.right == null){
            count++;
            return count;
        }

        count = countLeaf1(root.left, count);
        count = countLeaf1(root.right, count);
        return count;
    }

    public int countLeaf2(Node root){
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1 + countLeaf2(root.left) + countLeaf2(root.right);
        }

        countLeaf2(root.left);
        countLeaf2(root.right);
        return 0;
    }
}
