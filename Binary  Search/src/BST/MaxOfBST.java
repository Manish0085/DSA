package BST;

public class MaxOfBST {

    public Node max(Node root) {
        if(root == null)
            return null;

        Node temp = root;
        while (temp.right != null)
            temp = temp.right;
        return temp;
    }
}
