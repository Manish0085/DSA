public class CreateBinaryTreeFromInAndPostOrder {

    int post;

    public Node createTree(int[] inorder, int[] postorder, int start, int end){
        if (start > end)
            return null;

        Node root = new Node(postorder[post--]);
        int pos = find(inorder, root.data, start, end);
        root.right = createTree(inorder, postorder, pos+1, end);
        root.left = createTree(inorder, postorder, start, pos-1);
        return root;
    }

    private int find(int[] inorder, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (target == inorder[i])
                return i;
        }
        return -1;
    }

    public void test(int[] inorder, int[] postorder){
        this.post = inorder.length-1;
        createTree(inorder, postorder, 0, inorder.length-1);
    }
}
