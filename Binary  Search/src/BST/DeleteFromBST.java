package BST;

import javax.swing.tree.TreeNode;

public class DeleteFromBST {

    public Node deleteNode(Node root, int key) {

    }

    public Node dfs(Node root, int key) {
        if (root == null)
            return null;

        if (root.data < key) {
            root.right = dfs(root.right, key);
            return root;
        } else {
            root.left = dfs(root.left, key);
            return root;
        }
        if(key == root.data) {
            if (root.left == null && root.right == null)

        }

    }
}
