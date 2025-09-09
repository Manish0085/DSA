import com.sun.security.auth.UnixNumericGroupPrincipal;

public class IsBinaryTreeHeap {

    boolean isHeap(Node tree) {
        // count node in the tree
        int num = count(tree);


        // check if the tree is CBT or not
        boolean isCBT = CBT(tree, 0, num);

        // every Parent >= child;
        if (!isCBT)
            return isCBT;

        return maxHeap(tree);
    }

    private boolean maxHeap(Node root){

        if(root.left != null){
            if(root.data < root.left.data){
                return false;
            }

            if (!maxHeap(root.left)){
                return false;
            }
        }
        if(root.right != null){
            if(root.data < root.right.data){
                return false;
            }

            return maxHeap(root.right);

        }
        return true;
    }

    private boolean CBT(Node root, int index, int totalNodes){
        if (root == null)
            return true;

        if (index >= totalNodes)
            return false;

        return CBT(root.left, 2 * index + 1, totalNodes) && CBT(root.right, 2 * index + 2, totalNodes);
    }

    private int count(Node root){
        if (root == null)
            return 0;

        return 1 + count(root.left) + count(root.right);
    }
}
