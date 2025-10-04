public class MirrorTree {

    public void mirror(Node root){
        if (root == null)
            return;

        Node temp = root.left;
        temp.left = temp.right;
        temp.right = temp;
    }
}
