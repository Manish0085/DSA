public class AVLTreeDeletion {


    public Node delNode(Node root, int key){

        if(root == null){
            return null;
        }

        if(key > root.data){
            root.left = delNode(root.right, key);
        } else if (key < root.data) {
            root.left = delNode(root.left, key);
        } else {
            // Leaf node
            if (root.left == null && root.right == null){
                return null;
            }

            // only one child
            else if(root.left != null && root.right == null){
                return root.left;
            }
            else if (root.left == null && root.right != null){
                return root.right;
            }

            // Both child exists
            else {
                // Right side smallest element
                Node curr = root.right;
                while (curr.left != null){
                    curr = curr.left;
                }
                root.data = curr.data;
                root.right = delNode(root.right, curr.data);
            }
        }

        root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));
        int balance = getBalance(root);
        // Left side
        if (balance > 1){

            // LL
            if(getBalance(root.left) >= 0)
                return rightRotation(root);
            // LR
            else {
                root.left = leftRotation(root.left);
                return rightRotation(root);
            }
        }
        else if (balance < -1){
            // RR
            if (getBalance(root.right) <= 0){
                return rightRotation(root);
            } else {
                root.right = rightRotation(root.right);
                return leftRotation(root);
            }
        }
        else {
            return root;
        }

    }

    private int getHeight(Node root){
        if (root == null)
            return 0;
        return root.height;
    }

    private int getBalance(Node root){
        return getHeight(root.left) - getHeight(root.right);
    }


    public Node rightRotation(Node root){
        Node child = root.left;
        Node childRight = child.right;
        child.right = root;
        root.left = childRight;

        root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));
        child.height = 1 + Math.max(getHeight(child.left), getHeight(child.right));

        return child;
    }


    public Node leftRotation(Node root){
        Node child = root.right;
        Node childLeft = child.left;
        child.left = root;
        root.right = childLeft;

        root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));
        child.height = 1 + Math.max(getHeight(child.left), getHeight(child.right));
        return child;
    }
}
