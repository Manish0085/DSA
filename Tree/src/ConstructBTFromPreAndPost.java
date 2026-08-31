import java.util.List;

public class ConstructBTFromPreAndPost {

    public TreeNode buildTree(List<Integer> preOrder, List<Integer> inOrder) {
        return dfs(preOrder, inOrder, 0, preOrder.size()-1, 0, inOrder.size()-1);
    }

    private TreeNode dfs(List<Integer> preOrder, List<Integer> inOrder, int preStart, int preEnd, int inStart, int inEnd) {
        if(preStart > preEnd || inStart > inEnd)
            return null;

        int val = preOrder.get(preStart);
        TreeNode root = new TreeNode(val);
        int inIdx = -1;
        for(int i=inStart; i<= inEnd; i++) {
            if(inOrder.get(i) == val) {
                inIdx = i;
                break;
            }
        }

        int noOfNodes = inIdx - inStart;
        root.left = dfs(preOrder, inOrder, preStart + 1, preStart + noOfNodes, inStart, inIdx);
        root.right = dfs(preOrder, inOrder, preStart+noOfNodes+1, preEnd, inIdx+1, inEnd);
        return root;
    }
}
