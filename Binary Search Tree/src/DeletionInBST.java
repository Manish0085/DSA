public class DeletionInBST {

    public Node deleteNode(Node root, int target){
        if (root == null){
            return null;
        }

        if (root.data > target){
            root.left = deleteNode(root.left, target);
            return root;
        }else if (root.data < target){
            root.right = deleteNode(root.right, target);
            return root;
        }
        else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            }
            else {
                // find the greatest element
                Node child = root.left;
                Node parent = root;
                while (child.right  != null){
                    parent = child;
                    child = child.right;
                }

                if (parent != root){
                    parent.right = child.left;
                    child.left = root.left;
                    child.right = root.right;
                    return child;
                } else {
                    child.right = root.right;

                    return child;
                }
            }
        }
    }
}
