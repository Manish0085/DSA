public class AVLTreeCreation {

    public Node insert(Node root, int key){

        // doesn't exist
        if(root == null){
            return new Node(key);
        }
        // Exists
        if (root.data > key){
            root.left = insert(root.left, key); // left side
        } else if (root.data < key){
            root.right = insert(root.right, key); // right side
        } else {
            return root; // Duplicate elements are not allowed
        }

        // update height
        root.height = 1+Math.max(getHeight(root.left), getHeight(root.right));
        // check balancing
        int balance = getBalance(root);


        // Left-Left Case
        if (balance > 1 && key < root.left.data){
            return rightRotation(root);
        }
        // Right-Right Case
        else if (balance < -1 && key > root.right.data) {
            return leftRotation(root);
        }
        // Left-Right Case
        else if (balance > 1 && key > root.left.data) {
            root.left = leftRotation(root.left);
            return rightRotation(root);
        }


        // Right-Left Case
        else if (balance < -1 && key < root.right.data){
            root.right = rightRotation(root.right);
            return leftRotation(root);
        }
        // No unbalancing
        else {
            return root;
        }

    }

    // R-R
    private Node leftRotation(Node root){
        Node child = root.right;
        Node childLeft = child.left;
        child.left = root;
        root.right = childLeft;

        // update the height
        root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));
        child.height = 1 + Math.max(getHeight(child.left), getHeight(child.right));
        return child;

    }

    // L-L
    private Node rightRotation(Node root){
        Node child = root.left;
        Node childRight = child.right;
        child.right = root;
        root.left = childRight;

        // update the height
        root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));
        child.height = 1 + Math.max(getHeight(child.left), getHeight(child.right));
        return child;
    }


    private int getBalance(Node root){
        return getHeight(root.left)-getHeight(root.right);
    }

    private int getHeight(Node root){
        if (root == null)
            return 0;
        return root.height;
    }


    private void preorder(Node root){
        if (root == null)
            return;

        System.out.print(root.data + " ---> ");
        preorder(root.left);
        preorder(root.right);
    }

    private void inorder(Node root){
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ---> ");
        inorder(root.right);
    }
    public static void main(String[] args) {

        AVLTreeCreation obj = new AVLTreeCreation();
        // Duplicate elements are not allowed
        Node root = null;



        root = obj.insert(root, 10);
        root = obj.insert(root, 20);
        root = obj.insert(root, 30);
        root = obj.insert(root, 50);
        root = obj.insert(root, 70);
        root = obj.insert(root, 5);
        root = obj.insert(root, 100);
        root = obj.insert(root, 95);

        System.out.println("Pre-Order Traversal");
        obj.preorder(root);
        System.out.println("null\n");


        System.out.println("In-Order Traversal");
        obj.inorder(root);
        System.out.println("null");
    }
}
