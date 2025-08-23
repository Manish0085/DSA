public class CreateBinarySearchTree {


    public static Node createBST(Node root, int target){
        if (root == null){
            Node temp = new Node(target);
            return temp;
        }

        if (target < root.data)
            root.left = createBST(root.left, target);
        else
            root.right = createBST(root.right, target);

        return root;
    }

    private static boolean search(Node root, int target){
        if (root == null)
            return false;

        if (root.data == target)
            return true;

        if (root.data > target)
            return search(root.left, target);
        else
            return search(root.right, target);
    }


    private static void inorder(Node root){
        if (root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 17, 5, 11, 18, 2, 1, 20, 14};
        Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = createBST(root, arr[i]);
        }

        inorder(root);
        System.out.println();
        System.out.println(search(root, 31))    ;;
    }


}
