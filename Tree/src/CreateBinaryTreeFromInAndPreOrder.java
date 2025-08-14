public class CreateBinaryTreeFromInAndPreOrder {

    Node createTree(int[] in, int[] pre, int inStart, int inEnd, int index){
        if (inStart > inEnd)
            return null;
        Node root = new Node(in[index]);
        int pos = find(in, pre[index], inStart, inEnd);
        root.left = createTree(in, pre, inStart, pos-1, index+1);
        root.right = createTree(in, pre, pos+1, inEnd , index+(pos-inStart)+1);
        return root;
    }

    private int find(int[] in, int target, int start, int end){
        for (int i = start; i < end; i++) {
            if(target == in[i])
                return i;
        }
        return -1;
    }
}
