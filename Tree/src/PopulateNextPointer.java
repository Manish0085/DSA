class Node {
    int val;
    Node left;
    Node right;
    Node next;

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
        this.next = null;
    }
}
public class PopulateNextPointer {

    public Node connect(Node root) {
        dfs(root);
        return root;
    }

    public void dfs(Node root) {
        if (root == null)
            return;

        if(root.left != null && root.right != null)
            root.left.next = root.right;

        if (root.right != null && root.next != null)
            root.right.next = root.next.left;

        dfs(root.left);
        dfs(root.right);
    }
}
