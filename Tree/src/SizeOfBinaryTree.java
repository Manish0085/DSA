import javax.swing.plaf.IconUIResource;

public class SizeOfBinaryTree {

     public int findSize1(Node root, int count){
         if(root == null)
             return 0;

        count++;
        count = findSize1(root.left, count);
        count = findSize1(root.right, count);
        return count;
     }

    public int findSize2(Node root){
        if(root == null)
            return 0;

        return 1 + findSize2(root.left) + findSize2(root.right);
    }
}
