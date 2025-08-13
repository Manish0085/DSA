import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreInPostInSingleTraversal {

    class Pair{
        Node node;
        int num;


        public Pair(Node root, int second){
            this.node = root;
            this.num = second;
        }

    }
    public void preInPost(Node root){
        List<Integer> preorder = new ArrayList<>();
        List<Integer> inorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();

        if(root == null)
            return;

        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, 1));
        while (!stack.isEmpty()){
            Pair it = stack.pop();
            if (it.num == 1){
                preorder.add(it.node.data);
                it.num++;
                stack.push(it);
                if (it.node.left != null){
                    stack.push(new Pair(it.node.left, 1));
                }
            }
            else if (it.num == 2){
                inorder.add(it.node.data);
                it.num++;
                stack.push(it);
                if (it.node.right != null){
                    stack.push(new Pair(it.node.right, 1));
                }
            }
            else {
                postorder.add(it.node.data);
            }
        }
    }
}
