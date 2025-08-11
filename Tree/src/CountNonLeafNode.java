public class CountNonLeafNode {


    public int count1(Node root){
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 0;
        }

        return 1 + count1(root.left) + count1(root.right);
    }

    public int count2(Node root, int count){
        if (root == null){
            return count;
        }
        if (root.left == null && root.right == null){
            return count;
        }

        count++;
        count = count2(root.left, count);
        count = count2(root.right, count);
        return count;
    }
}
