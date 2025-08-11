public class HeightOfBinaryTree {


    public int findHeight(Node root){
        if (root == null){
            return 0;
        }
        if (root.left == null || root.right == null){
            return 0;
        }

        return 1 + Math.max(findHeight(root.left), findHeight(root.right));
    }


    public int findHeight(Node root, int count){
        if (root == null){
            return count;
        }
        count++;
        int leftCount = findHeight(root.left, count);
        int rightCount = findHeight(root.right, count);
        return Math.max(leftCount, rightCount);
    }


}
