package BST;

public class MinOfBST {

    public Node min(Node root) {
        if(root == null)
            return null;

        Node temp = root;
        while (temp.left != null)
            temp = temp.left;
        return temp;
    }
}
